package cm.aptoide.p092pt.timeline.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.view.custom.CircleView;
import cm.aptoide.p092pt.view.custom.DotsView;

/* loaded from: classes.dex */
public class LikeButtonView extends FrameLayout {
    private AnimatorSet animatorSet;
    private boolean iconEnabled;
    private CircleView vCircle;
    private DotsView vDotsView;
    private ImageView vHeart;
    private static final DecelerateInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    private static final AccelerateDecelerateInterpolator ACCELERATE_DECELERATE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private static final OvershootInterpolator OVERSHOOT_INTERPOLATOR = new OvershootInterpolator(4.0f);

    public LikeButtonView(Context context) {
        super(context);
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(C1146R.layout.view_like_button, (ViewGroup) this, true);
        this.vHeart = (ImageView) findViewById(C1146R.id.vHeart);
        this.vDotsView = (DotsView) findViewById(C1146R.id.vDotsView);
        this.vCircle = (CircleView) findViewById(C1146R.id.vCircle);
        this.iconEnabled = false;
        setupAnimation();
    }

    private void setHeartIconOnWithAnimation() {
        this.vHeart.setImageResource(C1146R.drawable.heart_on);
        this.vHeart.animate().cancel();
        this.vHeart.setScaleX(0.0f);
        this.vHeart.setScaleY(0.0f);
        this.vCircle.setInnerCircleRadiusProgress(0.0f);
        this.vCircle.setOuterCircleRadiusProgress(0.0f);
        this.vDotsView.setCurrentProgress(0.0f);
        this.animatorSet.start();
    }

    private void setHeartIconOnWithoutAnimation() {
        this.vHeart.setImageResource(C1146R.drawable.heart_on);
        this.vHeart.invalidate();
    }

    private void setHeartOffWithoutAnimation() {
        this.vHeart.setImageResource(C1146R.drawable.heart_off);
        this.vHeart.invalidate();
    }

    private void setupAnimation() {
        this.animatorSet = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.vCircle, CircleView.OUTER_CIRCLE_RADIUS_PROGRESS, 0.1f, 1.0f);
        objectAnimatorOfFloat.setDuration(250L);
        DecelerateInterpolator decelerateInterpolator = DECELERATE_INTERPOLATOR;
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.vCircle, CircleView.INNER_CIRCLE_RADIUS_PROGRESS, 0.1f, 1.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.setStartDelay(200L);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.vHeart, (Property<ImageView, Float>) ImageView.SCALE_Y, 0.2f, 1.0f);
        objectAnimatorOfFloat3.setDuration(350L);
        objectAnimatorOfFloat3.setStartDelay(250L);
        OvershootInterpolator overshootInterpolator = OVERSHOOT_INTERPOLATOR;
        objectAnimatorOfFloat3.setInterpolator(overshootInterpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.vHeart, (Property<ImageView, Float>) ImageView.SCALE_X, 0.2f, 1.0f);
        objectAnimatorOfFloat4.setDuration(350L);
        objectAnimatorOfFloat4.setStartDelay(250L);
        objectAnimatorOfFloat4.setInterpolator(overshootInterpolator);
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.vDotsView, DotsView.DOTS_PROGRESS, 0.0f, 1.0f);
        objectAnimatorOfFloat5.setDuration(900L);
        objectAnimatorOfFloat5.setStartDelay(50L);
        objectAnimatorOfFloat5.setInterpolator(ACCELERATE_DECELERATE_INTERPOLATOR);
        this.animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5);
        this.animatorSet.addListener(new AnimatorListenerAdapter() { // from class: cm.aptoide.pt.timeline.view.LikeButtonView.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                LikeButtonView.this.vCircle.setInnerCircleRadiusProgress(0.0f);
                LikeButtonView.this.vCircle.setOuterCircleRadiusProgress(0.0f);
                LikeButtonView.this.vDotsView.setCurrentProgress(50.0f);
                LikeButtonView.this.vHeart.setScaleX(1.0f);
                LikeButtonView.this.vHeart.setScaleY(1.0f);
            }
        });
    }

    public boolean isIconEnabled() {
        return this.iconEnabled;
    }

    public void setHeartState(boolean z) {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.animatorSet.cancel();
        }
        if (z) {
            setHeartIconOnWithAnimation();
        } else {
            setHeartOffWithoutAnimation();
        }
        this.iconEnabled = z;
    }

    public void setHeartStateWithoutAnimation(boolean z) {
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.animatorSet.cancel();
        }
        if (z) {
            setHeartIconOnWithoutAnimation();
        } else {
            setHeartOffWithoutAnimation();
        }
        this.iconEnabled = z;
    }

    public LikeButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public LikeButtonView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init();
    }

    @TargetApi(21)
    public LikeButtonView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init();
    }
}
