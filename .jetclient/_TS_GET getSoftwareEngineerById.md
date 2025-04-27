```toml
name = 'GET getSoftwareEngineerById'
sortWeight = 3000000
id = '44ce1cbc-b71c-443d-80b9-540f0cbb4361'
```

#### Script

```js
const response = jc.sendRequest({
    method: 'GET',
    url: 'http://localhost:8080/api/v1/software-engineers/2'
})
```
