class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] mentions= new int[numberOfUsers];
        int[] time= new int[numberOfUsers];
        Collections.sort(events, (a, b) ->{
            int t1= Integer.parseInt(a.get(1));
            int t2= Integer.parseInt(b.get(1));
            if (t1 != t2) return Integer.compare(t1, t2);

            boolean aIsOffline = a.get(0).equals("OFFLINE");
            boolean bIsOffline = b.get(0).equals("OFFLINE");

            if (aIsOffline && !bIsOffline) return -1;
            if (!aIsOffline && bIsOffline) return 1;

            return 0;
        });

        int n= events.size();
        for(int i=0; i<n; i++){
            int t= Integer.parseInt(events.get(i).get(1));
            if(events.get(i).get(0).equals("MESSAGE")){
                if(events.get(i).get(2).equals("HERE")){
                    for(int j=0; j<numberOfUsers; j++){
                        if(t>=time[j]) mentions[j] += 1;
                    }
                }else if(events.get(i).get(2).equals("ALL")){
                    for(int j=0; j<numberOfUsers; j++){
                        mentions[j] += 1;
                    }
                }else{
                    String[] arr= events.get(i).get(2).split(" ");
                    for(String num: arr){
                        int id= Integer.parseInt(num.substring(2));
                        mentions[id] += 1;
                    }
                }
            }else{
                int id= Integer.parseInt(events.get(i).get(2));
                time[id] = t+ 60;
            }
        }

        return mentions;
    }
}