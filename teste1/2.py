def hollowPyramid(N):
    assert N>=0;
    if(N==1):
        return 1
    else:
        return  4*(N-1)+ hollowPyramid(N-1);