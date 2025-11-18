package com.google.firebase.components;

import K8.c;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: B, reason: collision with root package name */
    private final List<c<?>> f38096B;

    public DependencyCycleException(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f38096B = list;
    }
}
