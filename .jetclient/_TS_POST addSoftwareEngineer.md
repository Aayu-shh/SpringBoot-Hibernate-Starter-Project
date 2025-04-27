```toml
name = 'POST addSoftwareEngineer'
sortWeight = 3500000
id = '0453a359-7123-4375-ab0a-dba7f54c70ab'
```

#### Script

```js
//Http Request

//const response = jc.sendRequest({
//    method: 'GET',
//    url: 'http://localhost:8080/'
//})

const response = jc.sendRequest({
    method: 'POST',
    url: 'http://localhost:8080/api/v1/software-engineers/add',
    headers: {
        'Content-Type': 'application/json'
    },
    body: {
        type: 'JSON',
        raw: JSON.stringify({ name: 'Gungun',
         techStack: 'Accounts,GST,Billing' })
    }
})
```
