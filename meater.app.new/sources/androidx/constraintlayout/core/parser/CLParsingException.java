package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: B, reason: collision with root package name */
    private final String f23794B;

    /* renamed from: C, reason: collision with root package name */
    private final int f23795C;

    /* renamed from: D, reason: collision with root package name */
    private final String f23796D;

    public String a() {
        return this.f23794B + " (" + this.f23796D + " at line " + this.f23795C + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
