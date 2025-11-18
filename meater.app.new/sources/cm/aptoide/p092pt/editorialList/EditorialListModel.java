package cm.aptoide.p092pt.editorialList;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: EditorialListModel.kt */
@Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m32267d2 = {"Lcm/aptoide/pt/editorialList/EditorialListModel;", HttpUrl.FRAGMENT_ENCODE_SET, "editorialCardListModel", "Lcm/aptoide/pt/editorialList/EditorialCardListModel;", "bonusAppcModel", "Lcm/aptoide/pt/bonus/BonusAppcModel;", "(Lcm/aptoide/pt/editorialList/EditorialCardListModel;Lcm/aptoide/pt/bonus/BonusAppcModel;)V", "getBonusAppcModel", "()Lcm/aptoide/pt/bonus/BonusAppcModel;", "getEditorialCardListModel", "()Lcm/aptoide/pt/editorialList/EditorialCardListModel;", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EditorialListModel {
    private final BonusAppcModel bonusAppcModel;
    private final EditorialCardListModel editorialCardListModel;

    public EditorialListModel(EditorialCardListModel editorialCardListModel, BonusAppcModel bonusAppcModel) {
        C9801m.m32346f(editorialCardListModel, "editorialCardListModel");
        C9801m.m32346f(bonusAppcModel, "bonusAppcModel");
        this.editorialCardListModel = editorialCardListModel;
        this.bonusAppcModel = bonusAppcModel;
    }

    public static /* synthetic */ EditorialListModel copy$default(EditorialListModel editorialListModel, EditorialCardListModel editorialCardListModel, BonusAppcModel bonusAppcModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            editorialCardListModel = editorialListModel.editorialCardListModel;
        }
        if ((i2 & 2) != 0) {
            bonusAppcModel = editorialListModel.bonusAppcModel;
        }
        return editorialListModel.copy(editorialCardListModel, bonusAppcModel);
    }

    /* renamed from: component1, reason: from getter */
    public final EditorialCardListModel getEditorialCardListModel() {
        return this.editorialCardListModel;
    }

    /* renamed from: component2, reason: from getter */
    public final BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }

    public final EditorialListModel copy(EditorialCardListModel editorialCardListModel, BonusAppcModel bonusAppcModel) {
        C9801m.m32346f(editorialCardListModel, "editorialCardListModel");
        C9801m.m32346f(bonusAppcModel, "bonusAppcModel");
        return new EditorialListModel(editorialCardListModel, bonusAppcModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditorialListModel)) {
            return false;
        }
        EditorialListModel editorialListModel = (EditorialListModel) other;
        return C9801m.m32341a(this.editorialCardListModel, editorialListModel.editorialCardListModel) && C9801m.m32341a(this.bonusAppcModel, editorialListModel.bonusAppcModel);
    }

    public final BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }

    public final EditorialCardListModel getEditorialCardListModel() {
        return this.editorialCardListModel;
    }

    public int hashCode() {
        return (this.editorialCardListModel.hashCode() * 31) + this.bonusAppcModel.hashCode();
    }

    public String toString() {
        return "EditorialListModel(editorialCardListModel=" + this.editorialCardListModel + ", bonusAppcModel=" + this.bonusAppcModel + ')';
    }
}
