package cm.aptoide.p092pt.reactions;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.networking.image.ImageLoader;
import cm.aptoide.p092pt.reactions.data.TopReaction;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class TopReactionsPreview {
    private ImageView firstReaction;
    private ImageView[] imageView;
    private TextView numberOfReactions;
    private ImageView secondReaction;
    private ImageView thirdReaction;

    public void clearReactions() {
        for (ImageView imageView : this.imageView) {
            imageView.setVisibility(8);
        }
        this.numberOfReactions.setVisibility(8);
    }

    public void initialReactionsSetup(View view) {
        this.firstReaction = (ImageView) view.findViewById(C1146R.id.reaction_1);
        this.secondReaction = (ImageView) view.findViewById(C1146R.id.reaction_2);
        this.thirdReaction = (ImageView) view.findViewById(C1146R.id.reaction_3);
        this.numberOfReactions = (TextView) view.findViewById(C1146R.id.number_of_reactions);
        this.imageView = new ImageView[]{this.firstReaction, this.secondReaction, this.thirdReaction};
    }

    public boolean isReactionValid(String str) {
        return (str.equals(HttpUrl.FRAGMENT_ENCODE_SET) || ReactionMapper.mapReaction(str) == -1) ? false : true;
    }

    public void onDestroy() {
        this.firstReaction = null;
        this.secondReaction = null;
        this.thirdReaction = null;
        this.numberOfReactions = null;
    }

    public void setReactions(List<TopReaction> list, int i2, Context context) {
        ImageView[] imageViewArr = {this.firstReaction, this.secondReaction, this.thirdReaction};
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 >= list.size() || !isReactionValid(list.get(i4).getType())) {
                imageViewArr[i4].setVisibility(8);
            } else {
                ImageLoader.with(context).loadWithShadowCircleTransform(ReactionMapper.mapReaction(list.get(i4).getType()), imageViewArr[i4]);
                imageViewArr[i4].setVisibility(0);
                i3++;
            }
        }
        if (i2 <= 0 || i3 <= 0) {
            this.numberOfReactions.setVisibility(8);
        } else {
            this.numberOfReactions.setText(String.valueOf(i2));
            this.numberOfReactions.setVisibility(0);
        }
    }
}
