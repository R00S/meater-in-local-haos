package cm.aptoide.p092pt.util;

import cm.aptoide.p092pt.comments.CommentNode;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Comment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import p024c.p041e.C0870d;

/* loaded from: classes.dex */
public class CommentOperations {
    public List<CommentNode> flattenByDepth(List<CommentNode> list) {
        LinkedList linkedList = new LinkedList();
        Stack stack = new Stack();
        stack.addAll(list);
        while (!stack.isEmpty()) {
            CommentNode commentNode = (CommentNode) stack.pop();
            linkedList.add(commentNode);
            if (commentNode.hasChild()) {
                for (CommentNode commentNode2 : commentNode.getChildComments()) {
                    commentNode2.setLevel(commentNode.getLevel() + 1);
                    stack.push(commentNode2);
                }
            }
        }
        return linkedList;
    }

    public List<CommentNode> transform(List<Comment> list) {
        C0870d c0870d = new C0870d();
        for (Comment comment : list) {
            Comment.Parent parent = comment.getParent();
            if (parent != null) {
                CommentNode commentNode = (CommentNode) c0870d.m5438g(parent.getId());
                if (commentNode == null) {
                    commentNode = new CommentNode();
                }
                commentNode.addChild(new CommentNode(comment));
                c0870d.m5435b(parent.getId(), commentNode);
            } else {
                CommentNode commentNode2 = (CommentNode) c0870d.m5438g(comment.getId());
                if (commentNode2 == null) {
                    c0870d.m5435b(comment.getId(), new CommentNode(comment));
                } else {
                    commentNode2.setComment(comment);
                }
            }
        }
        ArrayList arrayList = new ArrayList(c0870d.m5445n());
        for (int i2 = 0; i2 < c0870d.m5445n(); i2++) {
            arrayList.add((CommentNode) c0870d.m5446o(i2));
        }
        return arrayList;
    }
}
