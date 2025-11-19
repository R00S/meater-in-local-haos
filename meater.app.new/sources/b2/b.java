package b2;

/* compiled from: CacheKeyFactory.java */
/* loaded from: classes.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f30089a = new b() { // from class: b2.a
        @Override // b2.b
        public final String c(a2.g gVar) {
            return b.b(gVar);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ String b(a2.g gVar) {
        String str = gVar.f19991i;
        return str != null ? str : gVar.f19983a.toString();
    }

    String c(a2.g gVar);
}
