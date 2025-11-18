package cm.aptoide.p092pt.install;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.p460m.InterfaceC11257f;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class PackageRepository {
    private List<PackageInfo> memoryCache;
    private final PackageManager packageManager;

    public PackageRepository(PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    private C11234e<List<PackageInfo>> getAdbInstalledPackages() {
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.a3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10068f.m8239a();
            }
        });
    }

    private C11234e<List<PackageInfo>> getCachedInstalledPackages() {
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.d3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10093f.m8240b();
            }
        });
    }

    private C11234e<List<PackageInfo>> getInstalledPackages() {
        return getCachedInstalledPackages().m40102n0(getPackageManagerInstalledPackages()).m40102n0(getAdbInstalledPackages().m40065I0(Schedulers.m40658io())).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.install.q2
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f10240f.m8241c((List) obj);
            }
        });
    }

    private C11234e<List<PackageInfo>> getPackageManagerInstalledPackages() {
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.install.v2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10261f.m8243e();
            }
        });
    }

    private Single<Boolean> isPackageInstalled(final String str) {
        return Single.m39910c(new Callable() { // from class: cm.aptoide.pt.install.p2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10234f.m8246h(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAdbInstalledPackages$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m8239a() throws Exception {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                Process processExec = Runtime.getRuntime().exec("pm list packages");
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(this.packageManager.getPackageInfo(line.substring(line.indexOf(58) + 1), 0));
                    } catch (PackageManager.NameNotFoundException e2) {
                        e = e2;
                        throw new RuntimeException(e);
                    } catch (IOException e3) {
                        e = e3;
                        throw new RuntimeException(e);
                    } catch (InterruptedException e4) {
                        e = e4;
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                }
                processExec.waitFor();
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
                return arrayList;
            } catch (PackageManager.NameNotFoundException e5) {
                e = e5;
            } catch (IOException e6) {
                e = e6;
            } catch (InterruptedException e7) {
                e = e7;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCachedInstalledPackages$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m8240b() throws Exception {
        List<PackageInfo> list = this.memoryCache;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("No cached packages available!");
    }

    static /* synthetic */ Iterable lambda$getLatestInstalledPackages$0(List list) {
        return list;
    }

    static /* synthetic */ Integer lambda$getLatestInstalledPackages$1(PackageInfo packageInfo, PackageInfo packageInfo2) {
        long j2 = packageInfo.lastUpdateTime;
        long j3 = packageInfo2.lastUpdateTime;
        return Integer.valueOf(j2 < j3 ? 1 : j2 == j3 ? 0 : -1);
    }

    static /* synthetic */ Iterable lambda$getLatestInstalledPackages$2(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPackageLabel$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8242d(String str) throws Exception {
        try {
            return Single.m39913m(this.packageManager.getApplicationLabel(this.packageManager.getApplicationInfo(str, 0)).toString());
        } catch (Exception e2) {
            return Single.m39911h(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPackageManagerInstalledPackages$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m8243e() throws Exception {
        return this.packageManager.getInstalledPackages(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPackageVersionCode$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8244f(String str) throws Exception {
        try {
            return Single.m39913m(Integer.valueOf(this.packageManager.getPackageInfo(str, 0).versionCode));
        } catch (Exception e2) {
            return Single.m39911h(e2);
        }
    }

    static /* synthetic */ List lambda$getRandomInstalledPackages$13(List list) {
        Collections.shuffle(list);
        return list;
    }

    static /* synthetic */ Iterable lambda$getRandomInstalledPackages$14(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isAppInstalled$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8245g(String str, List list) {
        return isPackageInstalled(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$isPackageInstalled$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8246h(String str) throws Exception {
        try {
            return Single.m39913m(Boolean.valueOf(this.packageManager.getPackageInfo(str, 0) != null));
        } catch (PackageManager.NameNotFoundException unused) {
            return Single.m39913m(Boolean.FALSE);
        } catch (Exception e2) {
            return Single.m39911h(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCachedInstalledPackages, reason: merged with bridge method [inline-methods] */
    public void m8241c(List<PackageInfo> list) {
        this.memoryCache = list;
    }

    public C11234e<String> getLatestInstalledPackages(int i2) {
        return getInstalledPackages().m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.s2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                PackageRepository.lambda$getLatestInstalledPackages$0(list);
                return list;
            }
        }).m40087a1(new InterfaceC11257f() { // from class: cm.aptoide.pt.install.r2
            @Override // p456rx.p460m.InterfaceC11257f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return PackageRepository.lambda$getLatestInstalledPackages$1((PackageInfo) obj, (PackageInfo) obj2);
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.o2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                PackageRepository.lambda$getLatestInstalledPackages$2(list);
                return list;
            }
        }).m40073N0(i2).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.y2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PackageInfo) obj).packageName;
            }
        }).m40065I0(Schedulers.m40658io());
    }

    public Single<String> getPackageLabel(final String str) {
        return Single.m39910c(new Callable() { // from class: cm.aptoide.pt.install.w2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10265f.m8242d(str);
            }
        });
    }

    public Single<Integer> getPackageVersionCode(final String str) {
        return Single.m39910c(new Callable() { // from class: cm.aptoide.pt.install.b3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f10078f.m8244f(str);
            }
        });
    }

    public C11234e<String> getRandomInstalledPackages(int i2) {
        return getInstalledPackages().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.t2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                PackageRepository.lambda$getRandomInstalledPackages$13(list);
                return list;
            }
        }).m40066J(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.u2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                List list = (List) obj;
                PackageRepository.lambda$getRandomInstalledPackages$14(list);
                return list;
            }
        }).m40073N0(i2).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.z2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ((PackageInfo) obj).packageName;
            }
        }).m40065I0(Schedulers.m40658io());
    }

    public boolean isAppInstalled(final String str) {
        return ((Boolean) getInstalledPackages().m40085Z0().m39920i(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.x2
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f10270f.m8245g(str, (List) obj);
            }
        }).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.install.c3
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.FALSE;
            }
        }).m39933y().m40633b()).booleanValue();
    }
}
