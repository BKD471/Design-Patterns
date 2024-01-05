package javaRefresher.threads.binarytree;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    /**
     * @return
     * @throws Exception
     */
    private final Node root;
    private final ExecutorService executorService;

    TreeSizeCalculator(Node root,ExecutorService executorService){
        this.root=root;
        this.executorService=executorService;
    }
    @Override
    public Integer call() throws Exception {
        if(root==null) return 0;

        TreeSizeCalculator leftCalculator=
                new TreeSizeCalculator(root.left,executorService);
        TreeSizeCalculator rightCalculator=
                new TreeSizeCalculator(root.right,executorService);

        Future<Integer> lSize=executorService.submit(leftCalculator);
        Future<Integer> rSize=executorService.submit(rightCalculator);

        int leftSize=lSize.get();
        int rightSize=rSize.get();
        return leftSize+rightSize+1;
    }
}
