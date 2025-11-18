package com.squareup.picasso;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class StatsSnapshot {
    public final long averageDownloadSize;
    public final long averageOriginalBitmapSize;
    public final long averageTransformedBitmapSize;
    public final long cacheHits;
    public final long cacheMisses;
    public final int downloadCount;
    public final int maxSize;
    public final int originalBitmapCount;
    public final int size;
    public final long timeStamp;
    public final long totalDownloadSize;
    public final long totalOriginalBitmapSize;
    public final long totalTransformedBitmapSize;
    public final int transformedBitmapCount;

    public StatsSnapshot(int i2, int i3, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i4, int i5, int i6, long j10) {
        this.maxSize = i2;
        this.size = i3;
        this.cacheHits = j2;
        this.cacheMisses = j3;
        this.totalDownloadSize = j4;
        this.totalOriginalBitmapSize = j5;
        this.totalTransformedBitmapSize = j6;
        this.averageDownloadSize = j7;
        this.averageOriginalBitmapSize = j8;
        this.averageTransformedBitmapSize = j9;
        this.downloadCount = i4;
        this.originalBitmapCount = i5;
        this.transformedBitmapCount = i6;
        this.timeStamp = j10;
    }

    public void dump() {
        StringWriter stringWriter = new StringWriter();
        dump(new PrintWriter(stringWriter));
        Log.i("Picasso", stringWriter.toString());
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.maxSize + ", size=" + this.size + ", cacheHits=" + this.cacheHits + ", cacheMisses=" + this.cacheMisses + ", downloadCount=" + this.downloadCount + ", totalDownloadSize=" + this.totalDownloadSize + ", averageDownloadSize=" + this.averageDownloadSize + ", totalOriginalBitmapSize=" + this.totalOriginalBitmapSize + ", totalTransformedBitmapSize=" + this.totalTransformedBitmapSize + ", averageOriginalBitmapSize=" + this.averageOriginalBitmapSize + ", averageTransformedBitmapSize=" + this.averageTransformedBitmapSize + ", originalBitmapCount=" + this.originalBitmapCount + ", transformedBitmapCount=" + this.transformedBitmapCount + ", timeStamp=" + this.timeStamp + '}';
    }

    public void dump(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.maxSize);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.size);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.size / this.maxSize) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.cacheHits);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.cacheMisses);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.downloadCount);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.totalDownloadSize);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.averageDownloadSize);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.originalBitmapCount);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.totalOriginalBitmapSize);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.transformedBitmapCount);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.totalTransformedBitmapSize);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.averageOriginalBitmapSize);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.averageTransformedBitmapSize);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }
}
