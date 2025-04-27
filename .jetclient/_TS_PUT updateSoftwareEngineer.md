```toml
name = 'PUT updateSoftwareEngineer'
sortWeight = 3750000
id = 'd80cc474-6f13-465d-9e22-9e387e11d013'
```

#### Script

```js
//Http Request

//const response = jc.sendRequest({
//    method: 'GET',
//    url: 'http://localhost:8080/'
//})

const response = jc.sendRequest({
    method: 'PUT',
    url: 'http://localhost:8080/api/v1/software-engineers/3',
    headers: {
        'Content-Type': 'application/json'
    },
    body: {
        type: 'JSON',
        raw: JSON.stringify({ name: 'Gungun',
         techStack: 'Accounts,GST,Billing,MBA,BBA' })
    }
})
```
