package cm.aptoide.p092pt.account.view;

import android.content.ContentResolver;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import cm.aptoide.p092pt.account.view.exception.InvalidImageException;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.permission.AccountPermissionProvider;
import cm.aptoide.p092pt.permission.PermissionProvider;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p456rx.AbstractC11243h;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class ImagePickerPresenter implements Presenter {
    private static final int CAMERA_PICK = 6;
    private static final int GALLERY_PICK = 5;
    private final AccountPermissionProvider accountPermissionProvider;
    private final ContentResolver contentResolver;
    private final CrashReport crashReport;
    private final ImageLoader imageLoader;
    private final ImageValidator imageValidator;
    private final AbstractC11243h ioScheduler;
    private final ImagePickerNavigator navigator;
    private final PhotoFileGenerator photoFileGenerator;
    private final AbstractC11243h uiScheduler;
    private final UriToPathResolver uriToPathResolver;
    private final ImagePickerView view;

    public ImagePickerPresenter(ImagePickerView imagePickerView, CrashReport crashReport, AccountPermissionProvider accountPermissionProvider, PhotoFileGenerator photoFileGenerator, ImageValidator imageValidator, AbstractC11243h abstractC11243h, UriToPathResolver uriToPathResolver, ImagePickerNavigator imagePickerNavigator, ContentResolver contentResolver, ImageLoader imageLoader, AbstractC11243h abstractC11243h2) {
        this.view = imagePickerView;
        this.crashReport = crashReport;
        this.accountPermissionProvider = accountPermissionProvider;
        this.photoFileGenerator = photoFileGenerator;
        this.imageValidator = imageValidator;
        this.uiScheduler = abstractC11243h;
        this.uriToPathResolver = uriToPathResolver;
        this.navigator = imagePickerNavigator;
        this.contentResolver = contentResolver;
        this.imageLoader = imageLoader;
        this.ioScheduler = abstractC11243h2;
    }

    private Single<String> getFileNameFromCameraWithUri(final String str) {
        return this.navigator.navigateToCameraWithImageUri(6, Uri.parse(str)).m40057E().m40095j0(this.ioScheduler).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.l0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7317f.m6869a(str, (Void) obj);
            }
        }).m40085Z0();
    }

    private void handleCameraImageResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.s0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.f0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7305f.m6875g((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.u
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ImagePickerPresenter.lambda$handleCameraImageResult$35((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.d0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7301f.m6876h((Throwable) obj);
            }
        });
    }

    private void handleCameraSelection() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.i0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7311f.m6879k((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.o0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ImagePickerPresenter.lambda$handleCameraSelection$10((DialogInterface) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.k
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7314f.m6877i((Throwable) obj);
            }
        });
    }

    private void handleGalleryImageResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.g0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7307f.m6884p((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.q0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ImagePickerPresenter.lambda$handleGalleryImageResult$19((String) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.m0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ImagePickerPresenter.lambda$handleGalleryImageResult$20((Throwable) obj);
            }
        });
    }

    private void handleGallerySelection() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.s
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.v
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7488f.m6886r((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.t
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ImagePickerPresenter.lambda$handleGallerySelection$25((DialogInterface) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7312f.m6887s((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getFileNameFromCameraWithUri$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6869a(String str, Void r2) {
        return saveCameraPictureInPublicPhotos(str);
    }

    static /* synthetic */ Boolean lambda$handleCameraImageResult$28(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((PermissionProvider.Permission) it.next()).isGranted()) {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraImageResult$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6870b(List list) {
        this.view.dismissLoadImageDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraImageResult$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m6871c(List list) {
        return this.photoFileGenerator.generateNewImageFileUriAsString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraImageResult$32, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11231b m6873e(String str) {
        return getFileNameFromCameraWithUri(str).m39924p(this.uiScheduler).m39921j(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.h0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7309f.m6872d((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraImageResult$33, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6874f(Throwable th) {
        if (th instanceof InvalidImageException) {
            this.view.showIconPropertiesError((InvalidImageException) th);
        } else {
            this.crashReport.log(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraImageResult$34, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6875g(View.LifecycleEvent lifecycleEvent) {
        return this.accountPermissionProvider.permissionResultCamera(6).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.w
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ImagePickerPresenter.lambda$handleCameraImageResult$28((List) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.t0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7410f.m6870b((List) obj);
            }
        }).m40070L(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.n
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7349f.m6871c((List) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.c0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7297f.m6873e((String) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.k0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7315f.m6874f((Throwable) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleCameraImageResult$35(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraImageResult$36, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6876h(Throwable th) {
        this.crashReport.log(th);
    }

    static /* synthetic */ void lambda$handleCameraSelection$10(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraSelection$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6877i(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraSelection$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6878j(DialogInterface dialogInterface) {
        this.accountPermissionProvider.requestCameraPermission(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCameraSelection$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6879k(View.LifecycleEvent lifecycleEvent) {
        return this.view.dialogCameraSelected().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.j0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7313f.m6878j((DialogInterface) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGalleryImageResult$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6880l(List list) {
        this.view.dismissLoadImageDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGalleryImageResult$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6881m(List list) {
        return this.navigator.navigateToGalleryForImageUri(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGalleryImageResult$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6883o(Throwable th) {
        this.crashReport.log(th);
        if (th instanceof InvalidImageException) {
            this.view.showIconPropertiesError((InvalidImageException) th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGalleryImageResult$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6884p(View.LifecycleEvent lifecycleEvent) {
        return this.accountPermissionProvider.permissionResultCamera(5).m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((PermissionProvider.Permission) ((List) obj).get(0)).isGranted());
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.e0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7303f.m6880l((List) obj);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.a0
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7291f.m6881m((List) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.z
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7497f.m6882n((String) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.r
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7358f.m6883o((Throwable) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleGalleryImageResult$19(String str) {
    }

    static /* synthetic */ void lambda$handleGalleryImageResult$20(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGallerySelection$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6885q(DialogInterface dialogInterface) {
        this.accountPermissionProvider.requestGalleryPermission(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGallerySelection$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6886r(View.LifecycleEvent lifecycleEvent) {
        return this.view.dialogGallerySelected().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.b0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7294f.m6885q((DialogInterface) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleGallerySelection$25(DialogInterface dialogInterface) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleGallerySelection$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6887s(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePickImageClick$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6888t(Void r1) {
        this.view.showImagePickerDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePickImageClick$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6889u(View.LifecycleEvent lifecycleEvent) {
        return this.view.selectStoreImageClick().m40110s0().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.q
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7356f.m6888t((Void) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handlePickImageClick$3(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePickImageClick$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6890v(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadValidImageOrThrowForCamera$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6891w(String str) {
        this.view.loadImage(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadValidImageOrThrowForGallery$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6892x(String str) {
        this.view.loadImage(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadValidImageOrThrowForCamera, reason: merged with bridge method [inline-methods] */
    public C11231b m6872d(final String str) {
        return this.imageValidator.validateOrGetException(str).m39986z(this.uiScheduler).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.y
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7494f.m6891w(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadValidImageOrThrowForGallery, reason: merged with bridge method [inline-methods] */
    public C11231b m6882n(final String str) {
        return this.imageValidator.validateOrGetException(str).m39986z(this.uiScheduler).m39980m(new InterfaceC11252a() { // from class: cm.aptoide.pt.account.view.n0
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7350f.m6892x(str);
            }
        });
    }

    private Single<String> saveCameraPictureInPublicPhotos(String str) {
        Bitmap bitmapLoadBitmap = this.imageLoader.loadBitmap(str);
        if (bitmapLoadBitmap == null) {
            return Single.m39913m(str).m39930v(this.ioScheduler);
        }
        String strInsertImage = MediaStore.Images.Media.insertImage(this.contentResolver, bitmapLoadBitmap, str.substring(str.lastIndexOf(File.pathSeparator)), (String) null);
        bitmapLoadBitmap.recycle();
        return Single.m39913m(strInsertImage).m39930v(this.ioScheduler);
    }

    public void handlePickImageClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.m
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((View.LifecycleEvent) obj) == View.LifecycleEvent.CREATE);
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.account.view.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7354f.m6889u((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.p0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ImagePickerPresenter.lambda$handlePickImageClick$3((Void) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.account.view.r0
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7359f.m6890v((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handlePickImageClick();
        handleCameraSelection();
        handleCameraImageResult();
        handleGallerySelection();
        handleGalleryImageResult();
    }
}
