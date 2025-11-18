package Ub;

import Ub.i;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractC3820a;
import kotlin.collections.AbstractC3822c;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u001a¨\u0006\u001c"}, d2 = {"LUb/j;", "LUb/i;", "Ljava/util/regex/Matcher;", "matcher", "", "input", "<init>", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "a", "Ljava/util/regex/Matcher;", "b", "Ljava/lang/CharSequence;", "LUb/h;", "c", "LUb/h;", "getGroups", "()LUb/h;", "groups", "", "", "d", "Ljava/util/List;", "groupValues_", "Ljava/util/regex/MatchResult;", "()Ljava/util/regex/MatchResult;", "matchResult", "()Ljava/util/List;", "groupValues", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class j implements i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Matcher matcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CharSequence input;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h groups;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private List<String> groupValues_;

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ub/j$a", "Lkotlin/collections/c;", "", "", "index", "h", "(I)Ljava/lang/String;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC3822c<String> {
        a() {
        }

        public /* bridge */ boolean c(String str) {
            return super.contains(str);
        }

        @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return c((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC3822c, kotlin.collections.AbstractC3820a
        public int getSize() {
            return j.this.d().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC3822c, java.util.List
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public String get(int index) {
            String strGroup = j.this.d().group(index);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int i(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.AbstractC3822c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return i((String) obj);
            }
            return -1;
        }

        public /* bridge */ int j(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractC3822c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return j((String) obj);
            }
            return -1;
        }
    }

    /* compiled from: Regex.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ub/j$b", "", "Lkotlin/collections/a;", "LUb/g;", "", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "index", "h", "(I)LUb/g;", "getSize", "()I", "size", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC3820a<MatchGroup> implements h {

        /* compiled from: Regex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LUb/g;", "a", "(I)LUb/g;"}, k = 3, mv = {1, 9, 0})
        static final class a extends AbstractC3864v implements Ba.l<Integer, MatchGroup> {
            a() {
                super(1);
            }

            public final MatchGroup a(int i10) {
                return b.this.h(i10);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ MatchGroup invoke(Integer num) {
                return a(num.intValue());
            }
        }

        b() {
        }

        public /* bridge */ boolean c(MatchGroup matchGroup) {
            return super.contains(matchGroup);
        }

        @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof MatchGroup) {
                return c((MatchGroup) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC3820a
        public int getSize() {
            return j.this.d().groupCount() + 1;
        }

        public MatchGroup h(int index) {
            Ha.f fVarD = l.d(j.this.d(), index);
            if (fVarD.A().intValue() < 0) {
                return null;
            }
            String strGroup = j.this.d().group(index);
            C3862t.f(strGroup, "group(...)");
            return new MatchGroup(strGroup, fVarD);
        }

        @Override // kotlin.collections.AbstractC3820a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<MatchGroup> iterator() {
            return Tb.k.A(kotlin.collections.r.Z(kotlin.collections.r.n(this)), new a()).iterator();
        }
    }

    public j(Matcher matcher, CharSequence input) {
        C3862t.g(matcher, "matcher");
        C3862t.g(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult d() {
        return this.matcher;
    }

    @Override // Ub.i
    public i.b a() {
        return i.a.a(this);
    }

    @Override // Ub.i
    public List<String> b() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new a();
        }
        List<String> list = this.groupValues_;
        C3862t.d(list);
        return list;
    }
}
