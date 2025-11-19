package h9;

/* compiled from: HeartBeatInfo.java */
/* loaded from: classes2.dex */
public interface j {

    /* compiled from: HeartBeatInfo.java */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: B, reason: collision with root package name */
        private final int f42367B;

        a(int i10) {
            this.f42367B = i10;
        }

        public int j() {
            return this.f42367B;
        }
    }

    a b(String str);
}
