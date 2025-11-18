package j4;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import p4.SignUpRequestInput;
import p4.UserData;
import q4.InterfaceC4289e;
import t4.InterfaceC4558h;
import ta.InterfaceC4588d;

/* compiled from: SignUpUserDataUseCaseImpl.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lj4/h;", "Lt4/h;", "Lq4/e;", "userRepository", "<init>", "(Lq4/e;)V", "Lp4/l;", "input", "Ll4/b;", "Lp4/m;", "a", "(Lp4/l;Lta/d;)Ljava/lang/Object;", "Lq4/e;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: j4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3746h implements InterfaceC4558h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4289e userRepository;

    public C3746h(InterfaceC4289e userRepository) {
        C3862t.g(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    @Override // t4.InterfaceC4558h
    public Object a(SignUpRequestInput signUpRequestInput, InterfaceC4588d<? super AbstractC3900b<UserData>> interfaceC4588d) {
        return this.userRepository.c(signUpRequestInput, interfaceC4588d);
    }
}
