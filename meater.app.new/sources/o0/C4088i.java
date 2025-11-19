package o0;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C3831l;
import kotlin.jvm.internal.C3862t;

/* compiled from: PathParser.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u000f"}, d2 = {"Lo0/i;", "", "<init>", "()V", "", "pathData", "Ljava/util/ArrayList;", "Lo0/g;", "Lkotlin/collections/ArrayList;", "nodes", "a", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "[F", "nodeData", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4088i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float[] nodeData = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList b(C4088i c4088i, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return c4088i.a(str, arrayList);
    }

    public final ArrayList<AbstractC4086g> a(String pathData, ArrayList<AbstractC4086g> nodes) {
        int i10;
        char cCharAt;
        int i11;
        int length = pathData.length();
        int i12 = 0;
        while (i12 < length && C3862t.i(pathData.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && C3862t.i(pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                cCharAt = pathData.charAt(i12);
                int i14 = cCharAt | ' ';
                if ((i14 - 97) * (i14 - 122) <= 0 && i14 != 101) {
                    break;
                }
                if (i10 >= length) {
                    cCharAt = 0;
                    break;
                }
                i12 = i10;
            }
            if (cCharAt != 0) {
                if ((cCharAt | ' ') != 122) {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || C3862t.i(pathData.charAt(i10), 32) > 0) {
                            long jA = C4081b.a(pathData, i10, length);
                            i11 = (int) (jA >>> 32);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
                            if (!Float.isNaN(fIntBitsToFloat)) {
                                float[] fArr = this.nodeData;
                                int i15 = i13 + 1;
                                fArr[i13] = fIntBitsToFloat;
                                if (i15 >= fArr.length) {
                                    float[] fArr2 = new float[i15 * 2];
                                    this.nodeData = fArr2;
                                    C3831l.i(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i15;
                            }
                            while (i11 < length && pathData.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(fIntBitsToFloat)) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                C4087h.a(cCharAt, nodes, this.nodeData, i13);
            }
            i12 = i10;
        }
        return nodes;
    }
}
