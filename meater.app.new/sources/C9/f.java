package C9;

import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.Q;
import com.google.protobuf.Y;

/* compiled from: GaugeMetadata.java */
/* loaded from: classes2.dex */
public final class f extends AbstractC2962w<f, b> implements Q {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final f DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile Y<f> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* compiled from: GaugeMetadata.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3144a;

        static {
            int[] iArr = new int[AbstractC2962w.f.values().length];
            f3144a = iArr;
            try {
                iArr[AbstractC2962w.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3144a[AbstractC2962w.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3144a[AbstractC2962w.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3144a[AbstractC2962w.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3144a[AbstractC2962w.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3144a[AbstractC2962w.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3144a[AbstractC2962w.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: GaugeMetadata.java */
    public static final class b extends AbstractC2962w.a<f, b> implements Q {
        /* synthetic */ b(a aVar) {
            this();
        }

        public b L(int i10) {
            C();
            ((f) this.f39470C).h0(i10);
            return this;
        }

        public b M(int i10) {
            C();
            ((f) this.f39470C).i0(i10);
            return this;
        }

        public b N(int i10) {
            C();
            ((f) this.f39470C).j0(i10);
            return this;
        }

        private b() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC2962w.X(f.class, fVar);
    }

    private f() {
    }

    public static f e0() {
        return DEFAULT_INSTANCE;
    }

    public static b g0() {
        return DEFAULT_INSTANCE.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i10) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i10) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i10;
    }

    @Override // com.google.protobuf.AbstractC2962w
    protected final Object F(AbstractC2962w.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3144a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return AbstractC2962w.U(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC2962w.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
                        }
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public boolean f0() {
        return (this.bitField0_ & 16) != 0;
    }
}
