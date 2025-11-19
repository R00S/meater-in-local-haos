package androidx.profileinstaller;

/* compiled from: FileSectionType.java */
/* loaded from: classes.dex */
enum e {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* renamed from: B, reason: collision with root package name */
    private final long f28467B;

    e(long j10) {
        this.f28467B = j10;
    }

    public long j() {
        return this.f28467B;
    }
}
