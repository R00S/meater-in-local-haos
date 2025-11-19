package Hb;

/* compiled from: TypeProjectionImpl.java */
/* loaded from: classes3.dex */
public class G0 extends F0 {

    /* renamed from: a, reason: collision with root package name */
    private final Q0 f5657a;

    /* renamed from: b, reason: collision with root package name */
    private final U f5658b;

    public G0(Q0 q02, U u10) {
        if (q02 == null) {
            d(0);
        }
        if (u10 == null) {
            d(1);
        }
        this.f5657a = q02;
        this.f5658b = u10;
    }

    private static /* synthetic */ void d(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (i10 != 4 && i10 != 5) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // Hb.E0
    public U a() {
        U u10 = this.f5658b;
        if (u10 == null) {
            d(5);
        }
        return u10;
    }

    @Override // Hb.E0
    public Q0 b() {
        Q0 q02 = this.f5657a;
        if (q02 == null) {
            d(4);
        }
        return q02;
    }

    @Override // Hb.E0
    public boolean c() {
        return false;
    }

    @Override // Hb.E0
    public E0 r(Ib.g gVar) {
        if (gVar == null) {
            d(6);
        }
        return new G0(this.f5657a, gVar.a(this.f5658b));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G0(U u10) {
        this(Q0.f5693F, u10);
        if (u10 == null) {
            d(2);
        }
    }
}
