```toml
name = 'DELETE deleteSoftwareEngineerById'
sortWeight = 4000000
id = '07a8cfff-de83-462f-8ef9-8ef07784bc97'
```

#### Script

```js
const response = jc.sendRequest({
    method: 'DELETE',
    url: 'http://localhost:8080/api/v1/software-engineers/3'
})
```
