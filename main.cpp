#include<bits/stdc++.h>
using namespace std;
#define loop(start,end) for(int i=start;i<end;i++)
#define pb push_back
#define int long long
#define vi vector<int>
#define mii map<int,int>
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define w(tc)  int x;cin>>x;while(x--)
int power(int x, unsigned int y){
    int temp;
    if (y == 0)
        return 1;
    temp = power(x, y / 2)%1000000007;
    if (y % 2 == 0)
        return temp * temp;
    else
        return x * temp * temp;}

void solve(){
vector<string> arr;
int cnt=0;
for(int i=0;i<10;i++){
    string temp;cin>>temp;
    for(int j=0;j<10;j++){
        if(temp[j]=='X'){
        if(i==0 || i==9 || j==0 || j==9) cnt++;
        else if(i==1 || i==8 || j==1 || j==8) cnt+=2;
        else if(i==2 || i==7 || j==2 || j==7) cnt+=3;
        else if(i==3 || i==6 || j==3 || j==6) cnt+=4;
        else if(i==4 || i==5 || j==4 || j==5) cnt+=5;
       }
    }
}
cout<<cnt;
}

int32_t  main(){
fast_io;
       w(tc){
           solve();
           cout<<endl;
       }
    return 0;
}
