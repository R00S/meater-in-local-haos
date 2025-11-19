package J2;

import U1.x;
import X1.C1804a;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: TextInformationFrame.java */
/* loaded from: classes.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7267C;

    /* renamed from: D, reason: collision with root package name */
    @Deprecated
    public final String f7268D;

    /* renamed from: E, reason: collision with root package name */
    public final AbstractC4009y<String> f7269E;

    /* compiled from: TextInformationFrame.java */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    /* synthetic */ n(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static List<Integer> a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // U1.y.b
    public void L0(x.b bVar) throws NumberFormatException {
        String str = this.f7255B;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c10 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c10 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c10 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c10 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c10 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c10 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c10 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c10 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c10 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c10 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c10 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c10 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c10 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c10 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c10 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c10 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c10 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c10 = 22;
                    break;
                }
                break;
        }
        try {
            switch (c10) {
                case 0:
                case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    bVar.P(this.f7269E.get(0));
                    break;
                case 1:
                case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    bVar.U(this.f7269E.get(0));
                    break;
                case 2:
                case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    String str2 = this.f7269E.get(0);
                    bVar.h0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).g0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 18:
                    bVar.Q(this.f7269E.get(0));
                    break;
                case 4:
                case 19:
                    bVar.O(this.f7269E.get(0));
                    break;
                case 5:
                case 20:
                    bVar.V(this.f7269E.get(0));
                    break;
                case 6:
                case 21:
                    String[] strArrL1 = L.l1(this.f7269E.get(0), "/");
                    bVar.s0(Integer.valueOf(Integer.parseInt(strArrL1[0]))).r0(strArrL1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrL1[1])) : null);
                    break;
                case 7:
                case 17:
                    bVar.p0(this.f7269E.get(0));
                    break;
                case '\b':
                case 16:
                    bVar.t0(this.f7269E.get(0));
                    break;
                case '\t':
                case 22:
                    bVar.i0(Integer.valueOf(Integer.parseInt(this.f7269E.get(0))));
                    break;
                case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    Integer numM = p8.f.m(this.f7269E.get(0));
                    if (numM != null) {
                        String strA = j.a(numM.intValue());
                        if (strA != null) {
                            bVar.c0(strA);
                            break;
                        }
                    } else {
                        bVar.c0(this.f7269E.get(0));
                        break;
                    }
                    break;
                case 14:
                    List<Integer> listA = a(this.f7269E.get(0));
                    int size = listA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.g0(listA.get(2));
                            }
                        }
                        bVar.h0(listA.get(1));
                    }
                    bVar.i0(listA.get(0));
                    break;
                case 15:
                    List<Integer> listA2 = a(this.f7269E.get(0));
                    int size2 = listA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.j0(listA2.get(2));
                            }
                        }
                        bVar.k0(listA2.get(1));
                    }
                    bVar.l0(listA2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return L.d(this.f7255B, nVar.f7255B) && L.d(this.f7267C, nVar.f7267C) && this.f7269E.equals(nVar.f7269E);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f7255B.hashCode()) * 31;
        String str = this.f7267C;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f7269E.hashCode();
    }

    @Override // J2.i
    public String toString() {
        return this.f7255B + ": description=" + this.f7267C + ": values=" + this.f7269E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7255B);
        parcel.writeString(this.f7267C);
        parcel.writeStringArray((String[]) this.f7269E.toArray(new String[0]));
    }

    public n(String str, String str2, List<String> list) {
        super(str);
        C1804a.a(!list.isEmpty());
        this.f7267C = str2;
        AbstractC4009y<String> abstractC4009yB = AbstractC4009y.B(list);
        this.f7269E = abstractC4009yB;
        this.f7268D = abstractC4009yB.get(0);
    }

    private n(Parcel parcel) {
        this((String) C1804a.e(parcel.readString()), parcel.readString(), AbstractC4009y.D((String[]) C1804a.e(parcel.createStringArray())));
    }
}
