import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;

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


    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {

        Branch branch = findBranch(branchName);

        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {

        Branch branch = new findBranch(branchName);

        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }


    public Branch findBranch(String branchName) {

        for (int i = 0; i < branches.size(); i++) {

            if (branches.get(i).getName.equals(branchName)) {
                return branches.get(i);
            }
        }
        return null;
    }




}
