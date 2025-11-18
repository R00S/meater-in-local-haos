package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.squareup.picasso.Action;
import com.squareup.picasso.RemoteViewsAction;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class Picasso {
    static final String TAG = "Picasso";
    final Cache cache;
    private final CleanupThread cleanupThread;
    final Context context;
    final Bitmap.Config defaultBitmapConfig;
    final Dispatcher dispatcher;
    boolean indicatorsEnabled;
    private final Listener listener;
    volatile boolean loggingEnabled;
    final ReferenceQueue<Object> referenceQueue;
    private final List<RequestHandler> requestHandlers;
    private final RequestTransformer requestTransformer;
    boolean shutdown;
    final Stats stats;
    final Map<Object, Action> targetToAction;
    final Map<ImageView, DeferredRequestCreator> targetToDeferredRequestCreator;
    static final Handler HANDLER = new Handler(Looper.getMainLooper()) { // from class: com.squareup.picasso.Picasso.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 3) {
                Action action = (Action) message.obj;
                if (action.getPicasso().loggingEnabled) {
                    Utils.log("Main", "canceled", action.request.logId(), "target got garbage collected");
                }
                action.picasso.cancelExistingRequest(action.getTarget());
                return;
            }
            int i3 = 0;
            if (i2 == 8) {
                List list = (List) message.obj;
                int size = list.size();
                while (i3 < size) {
                    BitmapHunter bitmapHunter = (BitmapHunter) list.get(i3);
                    bitmapHunter.picasso.complete(bitmapHunter);
                    i3++;
                }
                return;
            }
            if (i2 != 13) {
                throw new AssertionError("Unknown handler message received: " + message.what);
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            while (i3 < size2) {
                Action action2 = (Action) list2.get(i3);
                action2.picasso.resumeAction(action2);
                i3++;
            }
        }
    };
    static volatile Picasso singleton = null;

    public static class Builder {
        private Cache cache;
        private final Context context;
        private Bitmap.Config defaultBitmapConfig;
        private Downloader downloader;
        private boolean indicatorsEnabled;
        private Listener listener;
        private boolean loggingEnabled;
        private List<RequestHandler> requestHandlers;
        private ExecutorService service;
        private RequestTransformer transformer;

        public Builder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.context = context.getApplicationContext();
        }

        public Builder addRequestHandler(RequestHandler requestHandler) {
            if (requestHandler == null) {
                throw new IllegalArgumentException("RequestHandler must not be null.");
            }
            if (this.requestHandlers == null) {
                this.requestHandlers = new ArrayList();
            }
            if (this.requestHandlers.contains(requestHandler)) {
                throw new IllegalStateException("RequestHandler already registered.");
            }
            this.requestHandlers.add(requestHandler);
            return this;
        }

        public Picasso build() {
            Context context = this.context;
            if (this.downloader == null) {
                this.downloader = Utils.createDefaultDownloader(context);
            }
            if (this.cache == null) {
                this.cache = new LruCache(context);
            }
            if (this.service == null) {
                this.service = new PicassoExecutorService();
            }
            if (this.transformer == null) {
                this.transformer = RequestTransformer.IDENTITY;
            }
            Stats stats = new Stats(this.cache);
            return new Picasso(context, new Dispatcher(context, this.service, Picasso.HANDLER, this.downloader, this.cache, stats), this.cache, this.listener, this.transformer, this.requestHandlers, stats, this.defaultBitmapConfig, this.indicatorsEnabled, this.loggingEnabled);
        }

        @Deprecated
        public Builder debugging(boolean z) {
            return indicatorsEnabled(z);
        }

        public Builder defaultBitmapConfig(Bitmap.Config config) {
            if (config == null) {
                throw new IllegalArgumentException("Bitmap config must not be null.");
            }
            this.defaultBitmapConfig = config;
            return this;
        }

        public Builder downloader(Downloader downloader) {
            if (downloader == null) {
                throw new IllegalArgumentException("Downloader must not be null.");
            }
            if (this.downloader != null) {
                throw new IllegalStateException("Downloader already set.");
            }
            this.downloader = downloader;
            return this;
        }

        public Builder executor(ExecutorService executorService) {
            if (executorService == null) {
                throw new IllegalArgumentException("Executor service must not be null.");
            }
            if (this.service != null) {
                throw new IllegalStateException("Executor service already set.");
            }
            this.service = executorService;
            return this;
        }

        public Builder indicatorsEnabled(boolean z) {
            this.indicatorsEnabled = z;
            return this;
        }

        public Builder listener(Listener listener) {
            if (listener == null) {
                throw new IllegalArgumentException("Listener must not be null.");
            }
            if (this.listener != null) {
                throw new IllegalStateException("Listener already set.");
            }
            this.listener = listener;
            return this;
        }

        public Builder loggingEnabled(boolean z) {
            this.loggingEnabled = z;
            return this;
        }

        public Builder memoryCache(Cache cache) {
            if (cache == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            }
            if (this.cache != null) {
                throw new IllegalStateException("Memory cache already set.");
            }
            this.cache = cache;
            return this;
        }

        public Builder requestTransformer(RequestTransformer requestTransformer) {
            if (requestTransformer == null) {
                throw new IllegalArgumentException("Transformer must not be null.");
            }
            if (this.transformer != null) {
                throw new IllegalStateException("Transformer already set.");
            }
            this.transformer = requestTransformer;
            return this;
        }
    }

    private static class CleanupThread extends Thread {
        private final Handler handler;
        private final ReferenceQueue<Object> referenceQueue;

        CleanupThread(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.referenceQueue = referenceQueue;
            this.handler = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws SecurityException, IllegalArgumentException {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    Action.RequestWeakReference requestWeakReference = (Action.RequestWeakReference) this.referenceQueue.remove(1000L);
                    Message messageObtainMessage = this.handler.obtainMessage();
                    if (requestWeakReference != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = requestWeakReference.action;
                        this.handler.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e2) {
                    this.handler.post(new Runnable() { // from class: com.squareup.picasso.Picasso.CleanupThread.1
                        @Override // java.lang.Runnable
                        public void run() {
                            throw new RuntimeException(e2);
                        }
                    });
                    return;
                }
            }
        }

        void shutdown() {
            interrupt();
        }
    }

    public interface Listener {
        void onImageLoadFailed(Picasso picasso, Uri uri, Exception exc);
    }

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        final int debugColor;

        LoadedFrom(int i2) {
            this.debugColor = i2;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    public interface RequestTransformer {
        public static final RequestTransformer IDENTITY = new RequestTransformer() { // from class: com.squareup.picasso.Picasso.RequestTransformer.1
            @Override // com.squareup.picasso.Picasso.RequestTransformer
            public Request transformRequest(Request request) {
                return request;
            }
        };

        Request transformRequest(Request request);
    }

    Picasso(Context context, Dispatcher dispatcher, Cache cache, Listener listener, RequestTransformer requestTransformer, List<RequestHandler> list, Stats stats, Bitmap.Config config, boolean z, boolean z2) {
        this.context = context;
        this.dispatcher = dispatcher;
        this.cache = cache;
        this.listener = listener;
        this.requestTransformer = requestTransformer;
        this.defaultBitmapConfig = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new ResourceRequestHandler(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new ContactsPhotoRequestHandler(context));
        arrayList.add(new MediaStoreRequestHandler(context));
        arrayList.add(new ContentStreamRequestHandler(context));
        arrayList.add(new AssetRequestHandler(context));
        arrayList.add(new FileRequestHandler(context));
        arrayList.add(new NetworkRequestHandler(dispatcher.downloader, stats));
        this.requestHandlers = Collections.unmodifiableList(arrayList);
        this.stats = stats;
        this.targetToAction = new WeakHashMap();
        this.targetToDeferredRequestCreator = new WeakHashMap();
        this.indicatorsEnabled = z;
        this.loggingEnabled = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.referenceQueue = referenceQueue;
        CleanupThread cleanupThread = new CleanupThread(referenceQueue, HANDLER);
        this.cleanupThread = cleanupThread;
        cleanupThread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelExistingRequest(Object obj) {
        Utils.checkMain();
        Action actionRemove = this.targetToAction.remove(obj);
        if (actionRemove != null) {
            actionRemove.cancel();
            this.dispatcher.dispatchCancel(actionRemove);
        }
        if (obj instanceof ImageView) {
            DeferredRequestCreator deferredRequestCreatorRemove = this.targetToDeferredRequestCreator.remove((ImageView) obj);
            if (deferredRequestCreatorRemove != null) {
                deferredRequestCreatorRemove.cancel();
            }
        }
    }

    private void deliverAction(Bitmap bitmap, LoadedFrom loadedFrom, Action action) {
        if (action.isCancelled()) {
            return;
        }
        if (!action.willReplay()) {
            this.targetToAction.remove(action.getTarget());
        }
        if (bitmap == null) {
            action.error();
            if (this.loggingEnabled) {
                Utils.log("Main", "errored", action.request.logId());
                return;
            }
            return;
        }
        if (loadedFrom == null) {
            throw new AssertionError("LoadedFrom cannot be null.");
        }
        action.complete(bitmap, loadedFrom);
        if (this.loggingEnabled) {
            Utils.log("Main", "completed", action.request.logId(), "from " + loadedFrom);
        }
    }

    public static void setSingletonInstance(Picasso picasso) {
        synchronized (Picasso.class) {
            if (singleton != null) {
                throw new IllegalStateException("Singleton instance already exists.");
            }
            singleton = picasso;
        }
    }

    public static Picasso with(Context context) {
        if (singleton == null) {
            synchronized (Picasso.class) {
                if (singleton == null) {
                    singleton = new Builder(context).build();
                }
            }
        }
        return singleton;
    }

    public boolean areIndicatorsEnabled() {
        return this.indicatorsEnabled;
    }

    public void cancelRequest(ImageView imageView) {
        cancelExistingRequest(imageView);
    }

    public void cancelTag(Object obj) {
        Utils.checkMain();
        ArrayList arrayList = new ArrayList(this.targetToAction.values());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Action action = (Action) arrayList.get(i2);
            if (action.getTag().equals(obj)) {
                cancelExistingRequest(action.getTarget());
            }
        }
    }

    void complete(BitmapHunter bitmapHunter) {
        Action action = bitmapHunter.getAction();
        List<Action> actions = bitmapHunter.getActions();
        boolean z = true;
        boolean z2 = (actions == null || actions.isEmpty()) ? false : true;
        if (action == null && !z2) {
            z = false;
        }
        if (z) {
            Uri uri = bitmapHunter.getData().uri;
            Exception exception = bitmapHunter.getException();
            Bitmap result = bitmapHunter.getResult();
            LoadedFrom loadedFrom = bitmapHunter.getLoadedFrom();
            if (action != null) {
                deliverAction(result, loadedFrom, action);
            }
            if (z2) {
                int size = actions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    deliverAction(result, loadedFrom, actions.get(i2));
                }
            }
            Listener listener = this.listener;
            if (listener == null || exception == null) {
                return;
            }
            listener.onImageLoadFailed(this, uri, exception);
        }
    }

    void defer(ImageView imageView, DeferredRequestCreator deferredRequestCreator) {
        this.targetToDeferredRequestCreator.put(imageView, deferredRequestCreator);
    }

    void enqueueAndSubmit(Action action) {
        Object target = action.getTarget();
        if (target != null && this.targetToAction.get(target) != action) {
            cancelExistingRequest(target);
            this.targetToAction.put(target, action);
        }
        submit(action);
    }

    List<RequestHandler> getRequestHandlers() {
        return this.requestHandlers;
    }

    public StatsSnapshot getSnapshot() {
        return this.stats.createSnapshot();
    }

    public void invalidate(Uri uri) {
        if (uri == null) {
            throw new IllegalArgumentException("uri == null");
        }
        this.cache.clearKeyUri(uri.toString());
    }

    @Deprecated
    public boolean isDebugging() {
        return areIndicatorsEnabled() && isLoggingEnabled();
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public RequestCreator load(Uri uri) {
        return new RequestCreator(this, uri, 0);
    }

    public void pauseTag(Object obj) {
        this.dispatcher.dispatchPauseTag(obj);
    }

    Bitmap quickMemoryCacheCheck(String str) {
        Bitmap bitmap = this.cache.get(str);
        if (bitmap != null) {
            this.stats.dispatchCacheHit();
        } else {
            this.stats.dispatchCacheMiss();
        }
        return bitmap;
    }

    void resumeAction(Action action) {
        Bitmap bitmapQuickMemoryCacheCheck = MemoryPolicy.shouldReadFromMemoryCache(action.memoryPolicy) ? quickMemoryCacheCheck(action.getKey()) : null;
        if (bitmapQuickMemoryCacheCheck == null) {
            enqueueAndSubmit(action);
            if (this.loggingEnabled) {
                Utils.log("Main", "resumed", action.request.logId());
                return;
            }
            return;
        }
        LoadedFrom loadedFrom = LoadedFrom.MEMORY;
        deliverAction(bitmapQuickMemoryCacheCheck, loadedFrom, action);
        if (this.loggingEnabled) {
            Utils.log("Main", "completed", action.request.logId(), "from " + loadedFrom);
        }
    }

    public void resumeTag(Object obj) {
        this.dispatcher.dispatchResumeTag(obj);
    }

    @Deprecated
    public void setDebugging(boolean z) {
        setIndicatorsEnabled(z);
    }

    public void setIndicatorsEnabled(boolean z) {
        this.indicatorsEnabled = z;
    }

    public void setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
    }

    public void shutdown() {
        if (this == singleton) {
            throw new UnsupportedOperationException("Default singleton instance cannot be shutdown.");
        }
        if (this.shutdown) {
            return;
        }
        this.cache.clear();
        this.cleanupThread.shutdown();
        this.stats.shutdown();
        this.dispatcher.shutdown();
        Iterator<DeferredRequestCreator> it = this.targetToDeferredRequestCreator.values().iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.targetToDeferredRequestCreator.clear();
        this.shutdown = true;
    }

    void submit(Action action) {
        this.dispatcher.dispatchSubmit(action);
    }

    Request transformRequest(Request request) {
        Request requestTransformRequest = this.requestTransformer.transformRequest(request);
        if (requestTransformRequest != null) {
            return requestTransformRequest;
        }
        throw new IllegalStateException("Request transformer " + this.requestTransformer.getClass().getCanonicalName() + " returned null for " + request);
    }

    public void cancelRequest(Target target) {
        cancelExistingRequest(target);
    }

    public RequestCreator load(String str) {
        if (str == null) {
            return new RequestCreator(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return load(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    public void cancelRequest(RemoteViews remoteViews, int i2) {
        cancelExistingRequest(new RemoteViewsAction.RemoteViewsTarget(remoteViews, i2));
    }

    public void invalidate(String str) {
        if (str != null) {
            invalidate(Uri.parse(str));
            return;
        }
        throw new IllegalArgumentException("path == null");
    }

    public void invalidate(File file) {
        if (file != null) {
            invalidate(Uri.fromFile(file));
            return;
        }
        throw new IllegalArgumentException("file == null");
    }

    public RequestCreator load(File file) {
        if (file == null) {
            return new RequestCreator(this, null, 0);
        }
        return load(Uri.fromFile(file));
    }

    public RequestCreator load(int i2) {
        if (i2 != 0) {
            return new RequestCreator(this, null, i2);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }
}
