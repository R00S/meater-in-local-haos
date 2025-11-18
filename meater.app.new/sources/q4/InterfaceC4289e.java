package q4;

import kotlin.Metadata;
import l4.AbstractC3900b;
import m4.CommonResponse;
import p4.CalibrationData;
import p4.CalibrationRequestInput;
import p4.CurrentOffers;
import p4.CurrentOffersRequestInput;
import p4.ForgotPasswordRequestInput;
import p4.LoginRequestInput;
import p4.MarkOfferViewedRequestInput;
import p4.MarkOffers;
import p4.SaveWatchedVideoRequestInput;
import p4.SignUpRequestInput;
import p4.UserData;
import p4.WatchedVideos;
import ta.InterfaceC4588d;

/* compiled from: UserRepository.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\bH¦@¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\u0006\u0010\u0003\u001a\u00020\u000bH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u0003\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\u0006\u0010\u0003\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00042\u0006\u0010\u0003\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0003\u001a\u00020\u001dH¦@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lq4/e;", "", "Lp4/g;", "input", "Ll4/b;", "Lp4/m;", "f", "(Lp4/g;Lta/d;)Ljava/lang/Object;", "Lp4/l;", "c", "(Lp4/l;Lta/d;)Ljava/lang/Object;", "Lp4/f;", "Lm4/c;", "b", "(Lp4/f;Lta/d;)Ljava/lang/Object;", "Lp4/n;", "a", "(Lta/d;)Ljava/lang/Object;", "Lp4/k;", "g", "(Lp4/k;Lta/d;)Ljava/lang/Object;", "Lp4/d;", "Lp4/c;", "d", "(Lp4/d;Lta/d;)Ljava/lang/Object;", "Lp4/b;", "Lp4/a;", "e", "(Lp4/b;Lta/d;)Ljava/lang/Object;", "Lp4/h;", "Lp4/i;", "h", "(Lp4/h;Lta/d;)Ljava/lang/Object;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: q4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC4289e {
    Object a(InterfaceC4588d<? super AbstractC3900b<WatchedVideos>> interfaceC4588d);

    Object b(ForgotPasswordRequestInput forgotPasswordRequestInput, InterfaceC4588d<? super AbstractC3900b<CommonResponse>> interfaceC4588d);

    Object c(SignUpRequestInput signUpRequestInput, InterfaceC4588d<? super AbstractC3900b<UserData>> interfaceC4588d);

    Object d(CurrentOffersRequestInput currentOffersRequestInput, InterfaceC4588d<? super AbstractC3900b<CurrentOffers>> interfaceC4588d);

    Object e(CalibrationRequestInput calibrationRequestInput, InterfaceC4588d<? super AbstractC3900b<CalibrationData>> interfaceC4588d);

    Object f(LoginRequestInput loginRequestInput, InterfaceC4588d<? super AbstractC3900b<UserData>> interfaceC4588d);

    Object g(SaveWatchedVideoRequestInput saveWatchedVideoRequestInput, InterfaceC4588d<? super AbstractC3900b<WatchedVideos>> interfaceC4588d);

    Object h(MarkOfferViewedRequestInput markOfferViewedRequestInput, InterfaceC4588d<? super AbstractC3900b<MarkOffers>> interfaceC4588d);
}
