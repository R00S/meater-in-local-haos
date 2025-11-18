package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: Handshake.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m32267d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/security/cert/Certificate;", "invoke", "()Ljava/util/List;", "<anonymous>"}, m32268k = 3, m32269mv = {1, 4, 0})
/* loaded from: classes3.dex */
final class Handshake$Companion$handshake$1 extends Lambda implements Function0<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Handshake$Companion$handshake$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
