package kotlinx.coroutines;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.aab.C1152a;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10547v;
import okhttp3.HttpUrl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: CoroutineContext.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0018B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, m32267d2 = {"Lkotlinx/coroutines/CoroutineId;", "Lkotlinx/coroutines/ThreadContextElement;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/AbstractCoroutineContextElement;", DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, HttpUrl.FRAGMENT_ENCODE_SET, "(J)V", "getId", "()J", "component1", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "restoreThreadContext", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "toString", "updateThreadContext", "Key", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.m0, reason: from Kotlin metadata and from toString */
/* loaded from: classes3.dex */
public final /* data */ class CoroutineId extends AbstractCoroutineContextElement implements ThreadContextElement<String> {

    /* renamed from: f */
    public static final a f41851f = new a(null);

    /* renamed from: g */
    private final long f41852g;

    /* compiled from: CoroutineContext.kt */
    @Metadata(m32266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m32267d2 = {"Lkotlinx/coroutines/CoroutineId$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/CoroutineId;", "()V", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
    /* renamed from: kotlinx.coroutines.m0$a */
    public static final class a implements CoroutineContext.c<CoroutineId> {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public CoroutineId(long j2) {
        super(f41851f);
        this.f41852g = j2;
    }

    /* renamed from: K, reason: from getter */
    public final long getF41852g() {
        return this.f41852g;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public void mo39627z(CoroutineContext coroutineContext, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public String mo39623I(CoroutineContext coroutineContext) {
        String f41856g;
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.f41855f);
        if (coroutineName == null || (f41856g = coroutineName.getF41856g()) == null) {
            f41856g = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iM37562b0 = C10547v.m37562b0(name, " @", 0, false, 6, null);
        if (iM37562b0 < 0) {
            iM37562b0 = name.length();
        }
        StringBuilder sb = new StringBuilder(f41856g.length() + iM37562b0 + 10);
        String strSubstring = name.substring(0, iM37562b0);
        C9801m.m32345e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(f41856g);
        sb.append('#');
        sb.append(this.f41852g);
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder(capacity).…builderAction).toString()");
        threadCurrentThread.setName(string);
        return name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CoroutineId) && this.f41852g == ((CoroutineId) other).f41852g;
    }

    public int hashCode() {
        return C1152a.m6829a(this.f41852g);
    }

    public String toString() {
        return "CoroutineId(" + this.f41852g + ')';
    }
}
