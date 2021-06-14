import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {

        Branch branch = findBranch(branchName);

        if (branch == null) {
            branch = new Branch(branchName);
            branches.add(branch);
            return true;
        }
        return false;
    }

}
