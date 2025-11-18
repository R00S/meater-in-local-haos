package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

/* compiled from: ErrorScopeKind.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.g */
/* loaded from: classes3.dex */
public enum EnumC10423g {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    ERASED_RECEIVER_TYPE_SCOPE("Error scope for erased receiver type"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    STUB_TYPE_SCOPE("Scope for stub type %s"),
    NON_CLASSIFIER_SUPER_TYPE_SCOPE("A scope for common supertype which is not a normal classifier"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    UNSUPPORTED_TYPE_SCOPE("Scope for unsupported type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s"),
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE("Error resolution candidate for call %s");


    /* renamed from: q */
    private final String f40257q;

    EnumC10423g(String str) {
        this.f40257q = str;
    }

    /* renamed from: k */
    public final String m37042k() {
        return this.f40257q;
    }
}
