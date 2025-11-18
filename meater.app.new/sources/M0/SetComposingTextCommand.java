package M0;

import H0.C1060d;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EditCommand.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001b"}, d2 = {"LM0/C;", "LM0/n;", "LH0/d;", "annotatedString", "", "newCursorPosition", "<init>", "(LH0/d;I)V", "", "text", "(Ljava/lang/String;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "LH0/d;", "getAnnotatedString", "()LH0/d;", "b", "I", "getNewCursorPosition", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: M0.C, reason: from toString */
/* loaded from: classes.dex */
public final class SetComposingTextCommand implements n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C1060d annotatedString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int newCursorPosition;

    public SetComposingTextCommand(C1060d c1060d, int i10) {
        this.annotatedString = c1060d;
        this.newCursorPosition = i10;
    }

    public final String a() {
        return this.annotatedString.getText();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetComposingTextCommand)) {
            return false;
        }
        SetComposingTextCommand setComposingTextCommand = (SetComposingTextCommand) other;
        return C3862t.b(a(), setComposingTextCommand.a()) && this.newCursorPosition == setComposingTextCommand.newCursorPosition;
    }

    public int hashCode() {
        return (a().hashCode() * 31) + this.newCursorPosition;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + a() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    public SetComposingTextCommand(String str, int i10) {
        this(new C1060d(str, null, null, 6, null), i10);
    }
}
