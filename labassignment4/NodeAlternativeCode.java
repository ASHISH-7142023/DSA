package labassignment4;

public class NodeAlternativeCode {
	protected int regd_no;

    protected float mark;

    protected Node next;



    Node(int regd_no, float mark) {

        this.regd_no = regd_no;

        this.mark = mark;

        this.next = null;

    }

}



public class Q1 {

    public static void main(String[] args) {

        Node start = null;

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\nMenu:");

            System.out.println("1. Insert at Beginning");

            System.out.println("2. Insert at End");

            System.out.println("3. Insert at Any Position");

            System.out.println("4. Delete from Beginning");

            System.out.println("5. Delete from End");

            System.out.println("6. Delete from Any Position");

            System.out.println("7. Delete by Registration Number");

            System.out.println("8. Search and Update by Registration Number");

            System.out.println("9. Sort by Marks");

            System.out.println("10. Count Nodes");

            System.out.println("11. Reverse List");

            System.out.println("12. Display List");

            System.out.println("13. Exit");

            System.out.print("Enter your choice: ");

            choice = sc.nextInt();



            switch (choice) {

                case 1:

                    start = InsBeg(start);

                    break;

                case 2:

                    start = InsEnd(start);

                    break;

                case 3:

                    start = InsAny(start);

                    break;

                case 4:

                    start = DelBeg(start);

                    break;

                case 5:

                    start = DelEnd(start);

                    break;

                case 6:

                    start = DelAny(start);

                    break;

                case 7:

                    start = DelByRegdNo(start);

                    break;

                case 8:

                    search(start);

                    break;

                case 9:

                    sort(start);

                    break;

                case 10:

                    System.out.println("Number of nodes: " + count(start));

                    break;

                case 11:

                    start = reverse(start);

                    break;

                case 12:

                    display(start);

                    break;

                case 13:

                    System.out.println("Exiting...");

                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");

            }

        } while (choice != 13);



        sc.close();

    }



    public static Node InsBeg(Node start) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registration number: ");

        int regd_no = sc.nextInt();

        System.out.print("Enter marks: ");

        float mark = sc.nextFloat();



        Node newNode = new Node(regd_no, mark);

        newNode.next = start;

        start = newNode;



        return start;

    }



    public static Node InsEnd(Node start) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registration number: ");

        int regd_no = sc.nextInt();

        System.out.print("Enter marks: ");

        float mark = sc.nextFloat();



        Node newNode = new Node(regd_no, mark);



        if (start == null) {

            start = newNode;

        } else {

            Node temp = start;

            while (temp.next != null) {

                temp = temp.next;

            }

            temp.next = newNode;

        }



        return start;

    }



    public static Node InsAny(Node start) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position: ");

        int pos = sc.nextInt();

        System.out.print("Enter registration number: ");

        int regd_no = sc.nextInt();

        System.out.print("Enter marks: ");

        float mark = sc.nextFloat();



        Node newNode = new Node(regd_no, mark);



        if (pos == 1) {

            newNode.next = start;

            start = newNode;

        } else {

            Node temp = start;

            for (int i = 1; i < pos - 1 && temp != null; i++) {

                temp = temp.next;

            }

            if (temp != null) {

                newNode.next = temp.next;

                temp.next = newNode;

            } else {

                System.out.println("Position out of range");

            }

        }



        return start;

    }



    public static Node DelBeg(Node start) {

        if (start == null) {

            System.out.println("List is empty");

        } else {

            start = start.next;

        }

        return start;

    }



    public static Node DelEnd(Node start) {

        if (start == null) {

            System.out.println("List is empty");

        } else if (start.next == null) {

            start = null;

        } else {

            Node temp = start;

            while (temp.next.next != null) {

                temp = temp.next;

            }

            temp.next = null;

        }

        return start;

    }



    public static Node DelAny(Node start) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position: ");

        int pos = sc.nextInt();



        if (start == null) {

            System.out.println("List is empty");

        } else if (pos == 1) {

            start = start.next;

        } else {

            Node p = start;

            for (int i = 1; i < pos - 1 && p != null; i++) {

                p = p.next;

            }

            if (p != null && p.next != null) {

                p.next = p.next.next;

            } else {

                System.out.println("Position out of range");

            }

        }



        return start;

    }



    public static Node DelByRegdNo(Node start) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registration number to delete: ");

        int regd_no = sc.nextInt();



        if (start == null) {

            System.out.println("List is empty");

        } else if (start.regd_no == regd_no) {

            start = start.next;

        } else {

            Node temp = start;

            while (temp.next != null && temp.next.regd_no != regd_no) {

                temp = temp.next;

            }

            if (temp.next != null) {

                temp.next = temp.next.next;

            } else {

                System.out.println("Registration number not found");

            }

        }



        return start;

    }



    public static void search(Node start) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter registration number to search: ");

        int regd_no = sc.nextInt();



        Node temp = start;

        while (temp != null && temp.regd_no != regd_no) {

            temp = temp.next;

        }



        if (temp != null) {

            System.out.print("Enter new marks: ");

            temp.mark = sc.nextFloat();

        } else {

            System.out.println("Registration number not found");

        }

    }



    public static void sort(Node start) {

        if (start == null || start.next == null) {

            return;

        }



        Node current, index;

        float tempMark;

        int tempRegdNo;



        for (current = start; current.next != null; current = current.next) {

            for (index = current.next; index != null; index = index.next) {

                if (current.mark < index.mark) {

                    tempMark = current.mark;

                    tempRegdNo = current.regd_no;

                    current.mark = index.mark;

                    current.regd_no = index.regd_no;

                    index.mark = tempMark;

                    index.regd_no = tempRegdNo;

                }

            }

        }

    }

    public static int count(Node start) {

        int count = 0;

        Node temp = start;

        while (temp != null) {

            count++;

            temp = temp.next;

        }

        return count;

    }



    public static Node reverse(Node start) {

        Node prev = null, current = start, next = null;



        while (current != null) {

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;

        }



        start = prev;

        return start;

    }



    public static void display(Node start) {

        Node temp = start;

        while (temp != null) {

            System.out.println("Regd_no: " + temp.regd_no + ", Marks: " + temp.mark);

            temp = temp.next;

        }

    }

}

