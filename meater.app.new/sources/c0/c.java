package c0;

import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import h0.C3478i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4169n;

/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc0/a;", "Landroid/view/ViewStructure;", "root", "Loa/F;", "b", "(Lc0/a;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "(Lc0/a;Landroid/util/SparseArray;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {
    public static final void a(C2305a c2305a, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = sparseArray.get(iKeyAt);
            f fVar = f.f30824a;
            if (fVar.d(autofillValue)) {
                c2305a.getAutofillTree().b(iKeyAt, fVar.i(autofillValue).toString());
            } else {
                if (fVar.b(autofillValue)) {
                    throw new C4169n("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (fVar.c(autofillValue)) {
                    throw new C4169n("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (fVar.e(autofillValue)) {
                    throw new C4169n("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void b(C2305a c2305a, ViewStructure viewStructure) {
        int iA = e.f30823a.a(viewStructure, c2305a.getAutofillTree().a().size());
        for (Map.Entry<Integer, h> entry : c2305a.getAutofillTree().a().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            h value = entry.getValue();
            e eVar = e.f30823a;
            ViewStructure viewStructureB = eVar.b(viewStructure, iA);
            if (viewStructureB != null) {
                f fVar = f.f30824a;
                AutofillId autofillIdA = fVar.a(viewStructure);
                C3862t.d(autofillIdA);
                fVar.g(viewStructureB, autofillIdA, iIntValue);
                eVar.d(viewStructureB, iIntValue, c2305a.getView().getContext().getPackageName(), null, null);
                fVar.h(viewStructureB, k.INSTANCE.a());
                List<j> listA = value.a();
                ArrayList arrayList = new ArrayList(listA.size());
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(b.a(listA.get(i10)));
                }
                fVar.f(viewStructureB, (String[]) arrayList.toArray(new String[0]));
                C3478i boundingBox = value.getBoundingBox();
                if (boundingBox == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int iRound = Math.round(boundingBox.getLeft());
                    int iRound2 = Math.round(boundingBox.getTop());
                    int iRound3 = Math.round(boundingBox.getRight());
                    e.f30823a.c(viewStructureB, iRound, iRound2, 0, 0, iRound3 - iRound, Math.round(boundingBox.getBottom()) - iRound2);
                }
            }
            iA++;
        }
    }
}
