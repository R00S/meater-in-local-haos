package M0;

import H0.C1060d;
import H0.InterfaceC1070n;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextFieldValue.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB)\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"LM0/E;", "", "LH0/d;", "annotatedString", "LH0/H;", "selection", "composition", "<init>", "(LH0/d;JLH0/H;Lkotlin/jvm/internal/k;)V", "", "text", "(Ljava/lang/String;JLH0/H;Lkotlin/jvm/internal/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "LH0/d;", "()LH0/d;", "b", "J", "c", "()J", "LH0/H;", "()LH0/H;", "d", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: M0.E, reason: from toString */
/* loaded from: classes.dex */
public final class TextFieldValue {

    /* renamed from: e, reason: collision with root package name */
    private static final Y.j<TextFieldValue, Object> f11870e = Y.k.a(a.f11874B, b.f11875B);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C1060d text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long selection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final H0.H composition;

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LY/l;", "LM0/E;", "it", "", "a", "(LY/l;LM0/E;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: M0.E$a */
    static final class a extends AbstractC3864v implements Ba.p<Y.l, TextFieldValue, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f11874B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Y.l lVar, TextFieldValue textFieldValue) {
            return kotlin.collections.r.g(H0.B.y(textFieldValue.getText(), H0.B.h(), lVar), H0.B.y(H0.H.b(textFieldValue.getSelection()), H0.B.j(H0.H.INSTANCE), lVar));
        }
    }

    /* compiled from: TextFieldValue.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LM0/E;", "a", "(Ljava/lang/Object;)LM0/E;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: M0.E$b */
    static final class b extends AbstractC3864v implements Ba.l<Object, TextFieldValue> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f11875B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextFieldValue invoke(Object obj) {
            C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Y.j<C1060d, Object> jVarH = H0.B.h();
            Boolean bool = Boolean.FALSE;
            H0.H hA = null;
            C1060d c1060dA = ((!C3862t.b(obj2, bool) || (jVarH instanceof InterfaceC1070n)) && obj2 != null) ? jVarH.a(obj2) : null;
            C3862t.d(c1060dA);
            Object obj3 = list.get(1);
            Y.j<H0.H, Object> jVarJ = H0.B.j(H0.H.INSTANCE);
            if ((!C3862t.b(obj3, bool) || (jVarJ instanceof InterfaceC1070n)) && obj3 != null) {
                hA = jVarJ.a(obj3);
            }
            C3862t.d(hA);
            return new TextFieldValue(c1060dA, hA.getPackedValue(), (H0.H) null, 4, (C3854k) null);
        }
    }

    public /* synthetic */ TextFieldValue(C1060d c1060d, long j10, H0.H h10, C3854k c3854k) {
        this(c1060d, j10, h10);
    }

    /* renamed from: a, reason: from getter */
    public final C1060d getText() {
        return this.text;
    }

    /* renamed from: b, reason: from getter */
    public final H0.H getComposition() {
        return this.composition;
    }

    /* renamed from: c, reason: from getter */
    public final long getSelection() {
        return this.selection;
    }

    public final String d() {
        return this.text.getText();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) other;
        return H0.H.e(this.selection, textFieldValue.selection) && C3862t.b(this.composition, textFieldValue.composition) && C3862t.b(this.text, textFieldValue.text);
    }

    public int hashCode() {
        int iHashCode = ((this.text.hashCode() * 31) + H0.H.l(this.selection)) * 31;
        H0.H h10 = this.composition;
        return iHashCode + (h10 != null ? H0.H.l(h10.getPackedValue()) : 0);
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.text) + "', selection=" + ((Object) H0.H.m(this.selection)) + ", composition=" + this.composition + ')';
    }

    public /* synthetic */ TextFieldValue(String str, long j10, H0.H h10, C3854k c3854k) {
        this(str, j10, h10);
    }

    private TextFieldValue(C1060d c1060d, long j10, H0.H h10) {
        this.text = c1060d;
        this.selection = H0.I.c(j10, 0, d().length());
        this.composition = h10 != null ? H0.H.b(H0.I.c(h10.getPackedValue(), 0, d().length())) : null;
    }

    public /* synthetic */ TextFieldValue(C1060d c1060d, long j10, H0.H h10, int i10, C3854k c3854k) {
        this(c1060d, (i10 & 2) != 0 ? H0.H.INSTANCE.a() : j10, (i10 & 4) != 0 ? null : h10, (C3854k) null);
    }

    public /* synthetic */ TextFieldValue(String str, long j10, H0.H h10, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? H0.H.INSTANCE.a() : j10, (i10 & 4) != 0 ? null : h10, (C3854k) null);
    }

    private TextFieldValue(String str, long j10, H0.H h10) {
        this(new C1060d(str, null, null, 6, null), j10, h10, (C3854k) null);
    }
}
