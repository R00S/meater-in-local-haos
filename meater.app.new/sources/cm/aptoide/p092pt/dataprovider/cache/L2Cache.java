package cm.aptoide.p092pt.dataprovider.cache;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.logger.Logger;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public class L2Cache extends StringBaseCache<Request, Response> {
    private static final String CACHE_CONTROL_HEADER = "Cache-Control";
    private static final int MAX_COUNT = 15;
    private static final String TAG = "cm.aptoide.pt.dataprovider.cache.L2Cache";
    private ConcurrentHashMap<String, ResponseCacheEntry> cache;
    private final File cacheFile;
    private volatile boolean isPersisting;
    private final Pattern pattern;
    private AtomicInteger persistenceCounter;

    public L2Cache(KeyAlgorithm<Request, String> keyAlgorithm, File file) {
        super(keyAlgorithm);
        this.pattern = Pattern.compile("\\d+");
        this.isPersisting = false;
        this.persistenceCounter = new AtomicInteger(0);
        this.cacheFile = file;
        this.cache = new ConcurrentHashMap<>(60);
        try {
            load();
        } catch (IOException unused) {
        }
    }

    private int extractNumber(String str) {
        Matcher matcher = this.pattern.matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(matcher.groupCount()));
        }
        return 0;
    }

    private void load() throws IOException {
        this.cache = (ConcurrentHashMap) new ObjectMapper().readValue(this.cacheFile, new TypeReference<ConcurrentHashMap<String, ResponseCacheEntry>>() { // from class: cm.aptoide.pt.dataprovider.cache.L2Cache.1
        });
        Logger.getInstance().m8273d(TAG, "Loaded cache file");
    }

    private void persist() {
        this.isPersisting = true;
        removeInvalid();
        try {
            store();
        } catch (IOException e2) {
            CrashReport.getInstance().log(e2);
        }
        do {
        } while (!this.persistenceCounter.compareAndSet(this.persistenceCounter.get(), 0));
        this.isPersisting = false;
    }

    private void removeInvalid() {
        for (Map.Entry<String, ResponseCacheEntry> entry : this.cache.entrySet()) {
            if (!entry.getValue().isValid()) {
                this.cache.remove(entry.getKey());
            }
        }
    }

    private int shouldCacheUntil(Response response) {
        Headers headers;
        try {
            headers = response.headers();
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
        }
        if (headers.size() <= 0) {
            Logger.getInstance().m8273d(TAG, "not caching the response due to empty headers");
            return 0;
        }
        List<String> listValues = headers.values(CACHE_CONTROL_HEADER);
        if (listValues.size() <= 0) {
            Logger.getInstance().m8273d(TAG, "not caching the response due to empty Cache-Control header");
            return 0;
        }
        for (String str : listValues) {
            if (str.startsWith("max-age") || str.startsWith("s-maxage")) {
                return extractNumber(str);
            }
        }
        return 0;
    }

    private void store() throws IOException {
        new ObjectMapper().writeValue(this.cacheFile, this.cache);
        Logger.getInstance().m8273d(TAG, "Stored cache file");
    }

    public void clean() {
        ConcurrentHashMap<String, ResponseCacheEntry> concurrentHashMap = this.cache;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        this.cache.clear();
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache, cm.aptoide.p092pt.dataprovider.cache.Cache
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains((L2Cache) obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.Cache
    public void destroy() {
        persist();
        this.cache.clear();
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache, cm.aptoide.p092pt.dataprovider.cache.Cache
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return super.get(obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache, cm.aptoide.p092pt.dataprovider.cache.Cache
    public /* bridge */ /* synthetic */ boolean isValid(Object obj) {
        return super.isValid((L2Cache) obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache, cm.aptoide.p092pt.dataprovider.cache.Cache
    public /* bridge */ /* synthetic */ void put(Object obj, Object obj2) {
        super.put((L2Cache) obj, obj2);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache, cm.aptoide.p092pt.dataprovider.cache.Cache
    public /* bridge */ /* synthetic */ void remove(Object obj) {
        super.remove((L2Cache) obj);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache
    public boolean contains(String str) {
        return this.cache.containsKey(str);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache
    public boolean isValid(String str) {
        ResponseCacheEntry responseCacheEntry = contains(str) ? this.cache.get(str) : null;
        if (responseCacheEntry != null) {
            return responseCacheEntry.isValid();
        }
        return false;
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache
    void remove(String str) {
        if (contains(str)) {
            this.cache.remove(str);
        }
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache
    public Response get(String str, Request request) {
        ResponseCacheEntry responseCacheEntry = this.cache.get(str);
        if (this.persistenceCounter.incrementAndGet() >= 15 && responseCacheEntry != null && !this.isPersisting) {
            persist();
        }
        return responseCacheEntry.getResponse(request);
    }

    @Override // cm.aptoide.p092pt.dataprovider.cache.StringBaseCache
    public void put(String str, Response response) {
        int iShouldCacheUntil = shouldCacheUntil(response);
        if (iShouldCacheUntil >= 1) {
            this.cache.put(str, new ResponseCacheEntry(response, iShouldCacheUntil));
        }
    }
}
