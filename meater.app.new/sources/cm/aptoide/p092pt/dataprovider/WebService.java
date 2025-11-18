package cm.aptoide.p092pt.dataprovider;

import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.p092pt.logger.Logger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Callable;
import okhttp3.OkHttpClient;
import p456rx.C11234e;
import p456rx.p457l.p459c.C11250a;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

/* loaded from: classes.dex */
public abstract class WebService<T, U> {
    public static final String BYPASS_HEADER_KEY = "X-Bypass-Cache";
    public static final String BYPASS_HEADER_VALUE = "true";
    private static Converter.Factory defaultConverterFactory;
    private final String baseHost;
    private final Class<T> clazz;
    protected final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    protected Retrofit retrofit;

    protected WebService(Class<T> cls, OkHttpClient okHttpClient, Converter.Factory factory, String str) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.clazz = cls;
        this.baseHost = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createService, reason: merged with bridge method [inline-methods] */
    public T m7422a() {
        return (T) getRetrofit(this.httpClient, this.converterFactory, RxJavaCallAdapterFactory.create(), this.baseHost).create(this.clazz);
    }

    private C11234e<T> createServiceObservable() {
        return C11234e.m40022P(new Callable() { // from class: cm.aptoide.pt.dataprovider.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f8516f.m7422a();
            }
        });
    }

    private ErrorRequestListener defaultErrorRequestListener() {
        return new ErrorRequestListener() { // from class: cm.aptoide.pt.dataprovider.a
            @Override // cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                WebService.lambda$defaultErrorRequestListener$3(th);
            }
        };
    }

    public static Converter.Factory getDefaultConverter() {
        if (defaultConverterFactory == null) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            objectMapper.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true);
            objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US));
            defaultConverterFactory = JacksonConverterFactory.create(objectMapper);
        }
        return defaultConverterFactory;
    }

    private Retrofit getRetrofit(OkHttpClient okHttpClient, Converter.Factory factory, CallAdapter.Factory factory2, String str) {
        if (this.retrofit == null) {
            this.retrofit = new Retrofit.Builder().baseUrl(str).client(okHttpClient).addCallAdapterFactory(factory2).addConverterFactory(factory).build();
        }
        return this.retrofit;
    }

    static /* synthetic */ void lambda$defaultErrorRequestListener$3(Throwable th) {
        Logger.getInstance().m8277e(ErrorRequestListener.class.getName(), "Erro por implementar");
        th.printStackTrace();
    }

    private void onLoadDataFromNetwork() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: prepareAndLoad, reason: merged with bridge method [inline-methods] */
    public C11234e<U> m7423b(T t, boolean z) {
        onLoadDataFromNetwork();
        return loadDataFromNetwork(t, z);
    }

    @Deprecated
    public void execute(SuccessRequestListener<U> successRequestListener, boolean z) {
        execute(successRequestListener, defaultErrorRequestListener(), z);
    }

    protected OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    protected boolean isNoNetworkException(Throwable th) {
        return th instanceof UnknownHostException;
    }

    protected abstract C11234e<U> loadDataFromNetwork(T t, boolean z);

    public C11234e<U> observe() {
        return observe(false);
    }

    @Deprecated
    public void execute(SuccessRequestListener<U> successRequestListener, final ErrorRequestListener errorRequestListener, boolean z) {
        observe(z).m40095j0(C11250a.m40156b()).m40063H0(successRequestListener, new InterfaceC11253b() { // from class: cm.aptoide.pt.dataprovider.c
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                errorRequestListener.onError((Throwable) obj);
            }
        });
    }

    public C11234e<U> observe(final boolean z) {
        return createServiceObservable().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.dataprovider.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f8518f.m7423b(z, obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Deprecated
    public void execute(SuccessRequestListener<U> successRequestListener, ErrorRequestListener errorRequestListener) {
        execute(successRequestListener, errorRequestListener, false);
    }
}
