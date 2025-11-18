package cm.aptoide.p092pt.store;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.room.RoomStore;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseRequestWithStore;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetHomeMetaRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreMetaRequest;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.logger.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.Single;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class StoreUtils {
    private static final String PRIVATE_STORE_ERROR_CODE = "STORE-3";
    private static final String PRIVATE_STORE_WRONG_CREDENTIALS_ERROR_CODE = "STORE-4";
    private static final String STORE_DOESNT_EXIST_ERROR_CODE = "STORE-1";
    private static final String STORE_SUSPENDED_ERROR_CODE = "STORE-7";

    public static String formatRepoUri(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("http//")) {
            lowerCase = lowerCase.replaceFirst("http//", "http://");
        }
        if (lowerCase.length() != 0 && lowerCase.charAt(lowerCase.length() - 1) != '/') {
            lowerCase = lowerCase + '/';
            Logger.getInstance().m8273d("Aptoide-ManageRepo", "repo uri: " + lowerCase);
        }
        if (lowerCase.startsWith("http://")) {
            return lowerCase;
        }
        String str2 = "http://" + lowerCase;
        Logger.getInstance().m8273d("Aptoide-ManageRepo", "repo uri: " + str2);
        return str2;
    }

    public static StoreError getErrorType(String str) {
        str.hashCode();
        switch (str) {
            case "STORE-1":
                return StoreError.STORE_DOESNT_EXIST;
            case "STORE-3":
                return StoreError.PRIVATE_STORE_ERROR;
            case "STORE-4":
                return StoreError.PRIVATE_STORE_WRONG_CREDENTIALS;
            case "STORE-7":
                return StoreError.STORE_SUSPENDED;
            default:
                return StoreError.GENERIC_ERROR;
        }
    }

    @Deprecated
    public static BaseRequestWithStore.StoreCredentials getStoreCredentials(long j2, StoreCredentialsProvider storeCredentialsProvider) {
        return storeCredentialsProvider.get(j2);
    }

    @Deprecated
    public static BaseRequestWithStore.StoreCredentials getStoreCredentialsFromUrl(String str, StoreCredentialsProvider storeCredentialsProvider) {
        return storeCredentialsProvider.fromUrl(str);
    }

    public static HashMapNotNull<String, List<String>> getSubscribedStoresAuthMap(RoomStoreRepository roomStoreRepository) {
        HashMapNotNull<String, List<String>> hashMapNotNull = new HashMapNotNull<>();
        for (RoomStore roomStore : roomStoreRepository.getAll().m40081W0().m40551b()) {
            if (roomStore.getPasswordSha1() != null) {
                hashMapNotNull.put(roomStore.getStoreName(), new LinkedList(Arrays.asList(roomStore.getUsername(), roomStore.getPasswordSha1())));
            }
        }
        if (hashMapNotNull.size() > 0) {
            return hashMapNotNull;
        }
        return null;
    }

    public static List<Long> getSubscribedStoresIds(RoomStoreRepository roomStoreRepository) {
        LinkedList linkedList = new LinkedList();
        Iterator<RoomStore> it = roomStoreRepository.getAll().m40081W0().m40551b().iterator();
        while (it.hasNext()) {
            linkedList.add(Long.valueOf(it.next().getStoreId()));
        }
        return linkedList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean isPrivateCredentialsSet(GetStoreMetaRequest getStoreMetaRequest) {
        return (((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStoreUser() == null || ((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStorePassSha1() == null) ? false : true;
    }

    public static Single<Boolean> isSubscribedStore(String str, RoomStoreRepository roomStoreRepository) {
        return roomStoreRepository.get(str).m39923n(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((RoomStore) obj) != null);
            }
        });
    }

    static /* synthetic */ C11234e lambda$subscribeStore$0(GetStoreMeta getStoreMeta, AptoideAccountManager aptoideAccountManager, String str, String str2, Account account) {
        return BaseV7Response.Info.Status.OK.equals(getStoreMeta.getInfo().getStatus()) ? account.isLoggedIn() ? aptoideAccountManager.subscribeStore(getStoreMeta.getData().getName(), str, str2).m39974b(C11234e.m40025S(getStoreMeta)) : C11234e.m40025S(getStoreMeta) : C11234e.m40017C(new Exception("Something went wrong while getting store meta"));
    }

    static /* synthetic */ void lambda$subscribeStore$3(SuccessRequestListener successRequestListener, GetStoreMeta getStoreMeta) {
        if (successRequestListener != null) {
            successRequestListener.call(getStoreMeta);
        }
    }

    static /* synthetic */ void lambda$subscribeStore$4(ErrorRequestListener errorRequestListener, Throwable th) {
        if (errorRequestListener != null) {
            errorRequestListener.onError(th);
        }
        CrashReport.getInstance().log(th);
    }

    static /* synthetic */ void lambda$unSubscribeStore$6(AptoideAccountManager aptoideAccountManager, String str, StoreCredentialsProvider storeCredentialsProvider, Boolean bool) {
        if (bool.booleanValue()) {
            aptoideAccountManager.unsubscribeStore(str, storeCredentialsProvider.get(str).getName(), storeCredentialsProvider.get(str).getPasswordSha1());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static C11231b saveStore(Store store, GetStoreMetaRequest getStoreMetaRequest, RoomStoreRepository roomStoreRepository) {
        RoomStore roomStore = new RoomStore();
        roomStore.setStoreId(store.getId());
        roomStore.setStoreName(store.getName());
        roomStore.setDownloads(store.getStats().getDownloads());
        roomStore.setIconPath(store.getAvatar());
        roomStore.setTheme(store.getAppearance().getTheme());
        if (isPrivateCredentialsSet(getStoreMetaRequest)) {
            roomStore.setUsername(((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStoreUser());
            roomStore.setPasswordSha1(((GetHomeMetaRequest.Body) getStoreMetaRequest.getBody()).getStorePassSha1());
        }
        return roomStoreRepository.save(roomStore);
    }

    public static ArrayList<String> split(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(split(it.next()));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static C11234e<GetStoreMeta> subscribeStore(final GetStoreMetaRequest getStoreMetaRequest, final AptoideAccountManager aptoideAccountManager, final String str, final String str2, final RoomStoreRepository roomStoreRepository) {
        return getStoreMetaRequest.observe().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.f
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                AptoideAccountManager aptoideAccountManager2 = aptoideAccountManager;
                return aptoideAccountManager2.accountStatus().m40057E().m40085Z0().m39922k(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.b
                    @Override // p456rx.p460m.InterfaceC11256e
                    public final Object call(Object obj2) {
                        return StoreUtils.lambda$subscribeStore$0(getStoreMeta, aptoideAccountManager2, str, str, (Account) obj2);
                    }
                });
            }
        }).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                GetStoreMeta getStoreMeta = (GetStoreMeta) obj;
                return StoreUtils.saveStore(getStoreMeta.getData(), getStoreMetaRequest, roomStoreRepository).m39974b(C11234e.m40025S(getStoreMeta));
            }
        });
    }

    public static void unSubscribeStore(final String str, final AptoideAccountManager aptoideAccountManager, final StoreCredentialsProvider storeCredentialsProvider, final RoomStoreRepository roomStoreRepository) {
        aptoideAccountManager.accountStatus().m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.valueOf(((Account) obj).isLoggedIn());
            }
        }).m40057E().m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.e
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                StoreUtils.lambda$unSubscribeStore$6(aptoideAccountManager, str, storeCredentialsProvider, (Boolean) obj);
            }
        }).m40062H(new InterfaceC11256e() { // from class: cm.aptoide.pt.store.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return roomStoreRepository.remove(str);
            }
        }).m40056D0();
    }

    @Deprecated
    public static BaseRequestWithStore.StoreCredentials getStoreCredentials(String str, StoreCredentialsProvider storeCredentialsProvider) {
        return storeCredentialsProvider.get(str);
    }

    public static String split(String str) {
        Logger.getInstance().m8273d("Aptoide-RepoUtils", "Splitting " + str);
        return formatRepoUri(str).split("http://")[1].split("\\.store")[0].split("\\.bazaarandroid.com")[0];
    }

    @Deprecated
    public static void subscribeStore(GetStoreMetaRequest getStoreMetaRequest, final SuccessRequestListener<GetStoreMeta> successRequestListener, final ErrorRequestListener errorRequestListener, AptoideAccountManager aptoideAccountManager, String str, String str2, RoomStoreRepository roomStoreRepository) {
        subscribeStore(getStoreMetaRequest, aptoideAccountManager, str, str2, roomStoreRepository).m40095j0(C11250a.m40156b()).m40063H0(new InterfaceC11253b() { // from class: cm.aptoide.pt.store.g
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                StoreUtils.lambda$subscribeStore$3(successRequestListener, (GetStoreMeta) obj);
            }
        }, new InterfaceC11253b() { // from class: cm.aptoide.pt.store.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                StoreUtils.lambda$subscribeStore$4(errorRequestListener, (Throwable) obj);
            }
        });
    }
}
