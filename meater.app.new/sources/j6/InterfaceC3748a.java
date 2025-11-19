package j6;

import W5.b;
import c6.CommonResponse;
import f6.CertificateResponse;
import f6.CurrentOffersResponse;
import f6.ForgotPasswordRequest;
import f6.LoginRequest;
import f6.LoginResponse;
import f6.MarkOfferResponse;
import f6.MarkOfferViewedRequest;
import f6.SaveWatchedVideoRequest;
import f6.SignUpRequest;
import f6.SignUpResponse;
import f6.WatchedVideosResponse;
import kotlin.Metadata;
import nd.s;
import pd.f;
import pd.o;
import pd.t;
import ta.InterfaceC4588d;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\"\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016H§@¢\u0006\u0004\b\u001c\u0010\u001aJ \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lj6/a;", "", "Lf6/g;", "request", "Lnd/s;", "Lf6/h;", "g", "(Lf6/g;Lta/d;)Ljava/lang/Object;", "Lf6/n;", "Lf6/o;", "d", "(Lf6/n;Lta/d;)Ljava/lang/Object;", "Lf6/e;", "Lc6/a;", "c", "(Lf6/e;Lta/d;)Ljava/lang/Object;", "Lf6/p;", "a", "(Lta/d;)Ljava/lang/Object;", "Lf6/l;", "e", "(Lf6/l;Lta/d;)Ljava/lang/Object;", "", "devices", "Lf6/d;", "h", "(Ljava/lang/String;Lta/d;)Ljava/lang/Object;", "Lf6/b;", "b", "Lf6/j;", "Lf6/i;", "f", "(Lf6/j;Lta/d;)Ljava/lang/Object;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3748a {
    @W5.a(b.f18425C)
    @f("/v2/user-tutorials")
    Object a(InterfaceC4588d<? super s<WatchedVideosResponse>> interfaceC4588d);

    @W5.a(b.f18425C)
    @f("/v2/calibration-certificate")
    Object b(@t("secureID") String str, InterfaceC4588d<? super s<CertificateResponse>> interfaceC4588d);

    @W5.a(b.f18425C)
    @o("/forgot-password")
    Object c(@pd.a ForgotPasswordRequest forgotPasswordRequest, InterfaceC4588d<? super s<CommonResponse>> interfaceC4588d);

    @W5.a(b.f18425C)
    @o("/register")
    Object d(@pd.a SignUpRequest signUpRequest, InterfaceC4588d<? super s<SignUpResponse>> interfaceC4588d);

    @W5.a(b.f18425C)
    @o("/v2/user-tutorials")
    Object e(@pd.a SaveWatchedVideoRequest saveWatchedVideoRequest, InterfaceC4588d<? super s<WatchedVideosResponse>> interfaceC4588d);

    @W5.a(b.f18425C)
    @o("/v2/user-offers/viewed")
    Object f(@pd.a MarkOfferViewedRequest markOfferViewedRequest, InterfaceC4588d<? super s<MarkOfferResponse>> interfaceC4588d);

    @W5.a(b.f18425C)
    @o("/login")
    Object g(@pd.a LoginRequest loginRequest, InterfaceC4588d<? super s<LoginResponse>> interfaceC4588d);

    @W5.a(b.f18425C)
    @f("/v2/user-offers/current")
    Object h(@t("devices") String str, InterfaceC4588d<? super s<CurrentOffersResponse>> interfaceC4588d);
}
