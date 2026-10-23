class Main {
    public static void main(String[] args) {
        student s= new student();
        s.set_marks(76,78,67);
        int[] mark=s.get_marks();
        for(int i=0;i<mark.length;i++){System.out.println(mark[i]);
                                      }
    }
}


class student 
    {
       private String name="";
        private long id=0;
        private int[]  marks={0,0,0};


        public void set_marks(int a,int b,int c)
        {
            this.marks[0]=a;
            this.marks[1]=b;
            this.marks[2]=c;
        }

        public int[] get_marks()
        {
            return this.marks;
        }
        
    }
