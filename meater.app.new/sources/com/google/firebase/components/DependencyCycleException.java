package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: f */
    private final List<C8124n<?>> f30671f;

    public DependencyCycleException(List<C8124n<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f30671f = list;
    }
}
