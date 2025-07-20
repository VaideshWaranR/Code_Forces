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

}

int32_t  main(){
fast_io;
#ifndef ONLINE_JUDGE
freopen("input.txt", "r", stdin);
freopen("output.txt", "w", stdout);
#endif 
       w(tc){
           solve();
           cout<<endl;
       }
    return 0;
}
