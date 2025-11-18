package cm.aptoide.p092pt.view.recycler.displayable;

import android.os.Bundle;
import cm.aptoide.p092pt.view.LifecycleSchim;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
public class Displayables implements LifecycleSchim {
    private final Queue<Displayable> temporaryDisplayables = new LinkedList();
    private final List<Displayable> displayables = new LinkedList();

    private void addDisplayableGroup(int i2, DisplayableGroup displayableGroup) {
        this.temporaryDisplayables.clear();
        this.temporaryDisplayables.addAll(displayableGroup.getChildren());
        LinkedList linkedList = new LinkedList();
        while (!this.temporaryDisplayables.isEmpty()) {
            Displayable displayablePoll = this.temporaryDisplayables.poll();
            if (displayablePoll instanceof DisplayableGroup) {
                this.temporaryDisplayables.addAll(((DisplayableGroup) displayablePoll).getChildren());
            } else {
                linkedList.add(displayablePoll);
            }
        }
        Collections.reverse(linkedList);
        this.displayables.addAll(i2, linkedList);
    }

    private boolean shouldIgnore(Displayable displayable) {
        return displayable instanceof EmptyDisplayable;
    }

    public void add(int i2, List<? extends Displayable> list) {
        Collections.reverse(list);
        Iterator<? extends Displayable> it = list.iterator();
        while (it.hasNext()) {
            add(i2, it.next());
        }
    }

    public void clear() {
        this.displayables.clear();
    }

    public Displayable get(Integer num) {
        if (this.displayables.size() > num.intValue()) {
            return this.displayables.get(num.intValue());
        }
        return null;
    }

    public int getPosition(Displayable displayable) {
        return this.displayables.indexOf(displayable);
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onDestroyView() {
        Iterator<Displayable> it = this.displayables.iterator();
        while (it.hasNext()) {
            it.next().onDestroyView();
        }
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onPause() {
        Iterator<Displayable> it = this.displayables.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onResume() {
        Iterator<Displayable> it = this.displayables.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onSaveInstanceState(Bundle bundle) {
        Iterator<Displayable> it = this.displayables.iterator();
        while (it.hasNext()) {
            it.next().onSaveInstanceState(bundle);
        }
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onViewCreated() {
        Iterator<Displayable> it = this.displayables.iterator();
        while (it.hasNext()) {
            it.next().onViewCreated();
        }
    }

    @Override // cm.aptoide.p092pt.view.LifecycleSchim
    public void onViewStateRestored(Bundle bundle) {
        Iterator<Displayable> it = this.displayables.iterator();
        while (it.hasNext()) {
            it.next().onViewStateRestored(bundle);
        }
    }

    public Displayable pop() {
        if (this.displayables.size() <= 0) {
            return null;
        }
        return this.displayables.remove(r0.size() - 1);
    }

    public int remove(int i2, int i3) {
        if (i2 < 0 || i2 >= size() || i3 < i2 || i3 > size()) {
            return 0;
        }
        int i4 = (i3 + 1) - i2;
        if (i4 == 0) {
            remove(i2);
            return 1;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            this.displayables.remove(i2);
        }
        return i4;
    }

    public int size() {
        return this.displayables.size();
    }

    public void add(int i2, Displayable displayable) {
        if (shouldIgnore(displayable)) {
            return;
        }
        if (displayable instanceof DisplayableGroup) {
            addDisplayableGroup(i2, (DisplayableGroup) displayable);
        } else {
            this.displayables.add(i2, displayable);
        }
    }

    public void remove(int i2) {
        if (i2 < 0 || i2 >= this.displayables.size()) {
            return;
        }
        this.displayables.remove(i2);
    }

    public void remove(Displayable displayable) {
        this.displayables.remove(displayable);
    }

    public void add(List<? extends Displayable> list) {
        Iterator<? extends Displayable> it = list.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public void add(Displayable displayable) {
        if (shouldIgnore(displayable)) {
            return;
        }
        if (displayable instanceof DisplayableGroup) {
            addDisplayableGroup((DisplayableGroup) displayable);
        } else {
            this.displayables.add(displayable);
        }
    }

    private void addDisplayableGroup(DisplayableGroup displayableGroup) {
        this.temporaryDisplayables.clear();
        this.temporaryDisplayables.addAll(displayableGroup.getChildren());
        while (!this.temporaryDisplayables.isEmpty()) {
            Displayable displayablePoll = this.temporaryDisplayables.poll();
            if (displayablePoll instanceof DisplayableGroup) {
                this.temporaryDisplayables.addAll(((DisplayableGroup) displayablePoll).getChildren());
            } else {
                this.displayables.add(displayablePoll);
            }
        }
    }
}
