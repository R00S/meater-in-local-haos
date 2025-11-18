package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.home;

import cm.aptoide.p092pt.bonus.BonusAppcModel;

/* loaded from: classes.dex */
public class EditorialActionItem {
    private ActionItemResponse actionItemResponse;
    private BonusAppcModel bonusAppcModel;

    public EditorialActionItem(ActionItemResponse actionItemResponse, BonusAppcModel bonusAppcModel) {
        this.actionItemResponse = actionItemResponse;
        this.bonusAppcModel = bonusAppcModel;
    }

    public ActionItemResponse getActionItemResponse() {
        return this.actionItemResponse;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }
}
