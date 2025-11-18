package U3;

/* compiled from: FileExtension.java */
/* loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* renamed from: B, reason: collision with root package name */
    public final String f17541B;

    c(String str) {
        this.f17541B = str;
    }

    public String j() {
        return ".temp" + this.f17541B;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f17541B;
    }
}
