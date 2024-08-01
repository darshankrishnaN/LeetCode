class Solution {
public:
    int countSeniors(vector<string>& details) {
        int count=0;
        for(int i=0;i<details.size();i++){
            string tmp="";
            for(int j=11;j<=12;j++){
                tmp+=details[i][j];
            }
            int age=stoi(tmp);
            if(age>60) count++;
        }
        return count;
    }
};