package javaRefresher.threads.binarytree;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);

        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;

        ExecutorService executorService= Executors.newCachedThreadPool();
        TreeSizeCalculator  treeSizeCalculator=new TreeSizeCalculator(root,executorService);
        Future<Integer> res=executorService.submit(treeSizeCalculator);
        System.out.println(res.get());
        executorService.shutdown();
    }
}
