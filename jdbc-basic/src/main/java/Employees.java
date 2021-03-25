public class Employees {

    private int empNo;
    private String eName;
    private String job;
    private int mgrNo;
    private String hiredate;
    private int sal;
    private int comm;
    private int deptNo;


    public Employees(int empNo, String eName, String job, int mgrNo, String hiredate, int sal, int comm, int deptNo) {
        this.empNo = empNo;
        this.eName = eName;
        this.job = job;
        this.mgrNo = mgrNo;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getMgrNo() {
        return mgrNo;
    }

    public void setMgrNo(int mgrNo) {
        this.mgrNo = mgrNo;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }


    @Override
    public String toString (){
        return "Employees{" +
                " | Employee number: " + empNo +
                " | Employee name: " + eName +
                " | Employee's job: " + job +
                " | Manager number: " + mgrNo +
                " | Hiredate: " + hiredate +
                " | Salary: " + sal +
                " | Commission: " + comm +
                " | Department number: " + deptNo;
    }
}
