def datagram(s):
    d=dict()
    for c in s: 
        if c not in d:
            d[c]=1
        else:
            d[c]=d[c]+1
    return d
w=datagram('lets get started with github')
print(w)

  
