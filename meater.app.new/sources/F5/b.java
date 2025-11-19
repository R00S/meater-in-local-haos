package F5;

import T4.o;
import T4.s;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import java.io.IOException;
import x4.f;

/* compiled from: MeaterAccountRepository.java */
/* loaded from: classes2.dex */
public class b implements o {

    /* renamed from: a, reason: collision with root package name */
    private final s f4559a;

    public b(s sVar) {
        this.f4559a = sVar;
    }

    @Override // T4.o
    public void a(MeaterCloudAccountResponse meaterCloudAccountResponse) {
        try {
            this.f4559a.J(f.f52783a.d().x(meaterCloudAccountResponse).execute(), meaterCloudAccountResponse);
        } catch (IOException unused) {
            this.f4559a.s();
        }
    }

    @Override // T4.o
    public void b(MeaterCloudAccountResponse meaterCloudAccountResponse) {
        try {
            this.f4559a.J(f.f52783a.d().s(meaterCloudAccountResponse).execute(), meaterCloudAccountResponse);
        } catch (IOException unused) {
            this.f4559a.s();
        }
    }

    @Override // T4.o
    public void c(MeaterCloudAccountResponse meaterCloudAccountResponse) {
        try {
            this.f4559a.J(f.f52783a.d().r(meaterCloudAccountResponse).execute(), meaterCloudAccountResponse);
        } catch (IOException unused) {
            this.f4559a.s();
        }
    }

    @Override // T4.o
    public void d(MeaterCloudAccountResponse meaterCloudAccountResponse) {
        try {
            this.f4559a.J(f.f52783a.d().k(meaterCloudAccountResponse).execute(), meaterCloudAccountResponse);
        } catch (IOException unused) {
            this.f4559a.s();
        }
    }

    @Override // T4.o
    public void e(MeaterCloudAccountResponse meaterCloudAccountResponse) {
        try {
            this.f4559a.J(f.f52783a.d().A(meaterCloudAccountResponse).execute(), meaterCloudAccountResponse);
        } catch (IOException unused) {
            this.f4559a.s();
        }
    }

    @Override // T4.o
    public void f(MeaterCloudAccountResponse meaterCloudAccountResponse) {
        try {
            this.f4559a.J(f.f52783a.d().i(meaterCloudAccountResponse).execute(), meaterCloudAccountResponse);
        } catch (IOException unused) {
            this.f4559a.s();
        }
    }
}
