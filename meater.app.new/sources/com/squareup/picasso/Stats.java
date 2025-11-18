package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
class Stats {
    private static final int BITMAP_DECODE_FINISHED = 2;
    private static final int BITMAP_TRANSFORMED_FINISHED = 3;
    private static final int CACHE_HIT = 0;
    private static final int CACHE_MISS = 1;
    private static final int DOWNLOAD_FINISHED = 4;
    private static final String STATS_THREAD_NAME = "Picasso-Stats";
    long averageDownloadSize;
    long averageOriginalBitmapSize;
    long averageTransformedBitmapSize;
    final Cache cache;
    long cacheHits;
    long cacheMisses;
    int downloadCount;
    final Handler handler;
    int originalBitmapCount;
    final HandlerThread statsThread;
    long totalDownloadSize;
    long totalOriginalBitmapSize;
    long totalTransformedBitmapSize;
    int transformedBitmapCount;

    private static class StatsHandler extends Handler {
        private final Stats stats;

        public StatsHandler(Looper looper, Stats stats) {
            super(looper);
            this.stats = stats;
        }

        @Override // android.os.Handler
        public void handleMessage(final Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                this.stats.performCacheHit();
                return;
            }
            if (i2 == 1) {
                this.stats.performCacheMiss();
                return;
            }
            if (i2 == 2) {
                this.stats.performBitmapDecoded(message.arg1);
                return;
            }
            if (i2 == 3) {
                this.stats.performBitmapTransformed(message.arg1);
            } else if (i2 != 4) {
                Picasso.HANDLER.post(new Runnable() { // from class: com.squareup.picasso.Stats.StatsHandler.1
                    @Override // java.lang.Runnable
                    public void run() {
                        throw new AssertionError("Unhandled stats message." + message.what);
                    }
                });
            } else {
                this.stats.performDownloadFinished((Long) message.obj);
            }
        }
    }

    Stats(Cache cache) {
        this.cache = cache;
        HandlerThread handlerThread = new HandlerThread(STATS_THREAD_NAME, 10);
        this.statsThread = handlerThread;
        handlerThread.start();
        Utils.flushStackLocalLeaks(handlerThread.getLooper());
        this.handler = new StatsHandler(handlerThread.getLooper(), this);
    }

    private static long getAverage(int i2, long j2) {
        return j2 / i2;
    }

    private void processBitmap(Bitmap bitmap, int i2) {
        int bitmapBytes = Utils.getBitmapBytes(bitmap);
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(i2, bitmapBytes, 0));
    }

    StatsSnapshot createSnapshot() {
        return new StatsSnapshot(this.cache.maxSize(), this.cache.size(), this.cacheHits, this.cacheMisses, this.totalDownloadSize, this.totalOriginalBitmapSize, this.totalTransformedBitmapSize, this.averageDownloadSize, this.averageOriginalBitmapSize, this.averageTransformedBitmapSize, this.downloadCount, this.originalBitmapCount, this.transformedBitmapCount, System.currentTimeMillis());
    }

    void dispatchBitmapDecoded(Bitmap bitmap) {
        processBitmap(bitmap, 2);
    }

    void dispatchBitmapTransformed(Bitmap bitmap) {
        processBitmap(bitmap, 3);
    }

    void dispatchCacheHit() {
        this.handler.sendEmptyMessage(0);
    }

    void dispatchCacheMiss() {
        this.handler.sendEmptyMessage(1);
    }

    void dispatchDownloadFinished(long j2) {
        Handler handler = this.handler;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j2)));
    }

    void performBitmapDecoded(long j2) {
        int i2 = this.originalBitmapCount + 1;
        this.originalBitmapCount = i2;
        long j3 = this.totalOriginalBitmapSize + j2;
        this.totalOriginalBitmapSize = j3;
        this.averageOriginalBitmapSize = getAverage(i2, j3);
    }

    void performBitmapTransformed(long j2) {
        this.transformedBitmapCount++;
        long j3 = this.totalTransformedBitmapSize + j2;
        this.totalTransformedBitmapSize = j3;
        this.averageTransformedBitmapSize = getAverage(this.originalBitmapCount, j3);
    }

    void performCacheHit() {
        this.cacheHits++;
    }

    void performCacheMiss() {
        this.cacheMisses++;
    }

    void performDownloadFinished(Long l) {
        this.downloadCount++;
        long jLongValue = this.totalDownloadSize + l.longValue();
        this.totalDownloadSize = jLongValue;
        this.averageDownloadSize = getAverage(this.downloadCount, jLongValue);
    }

    void shutdown() {
        this.statsThread.quit();
    }
}
