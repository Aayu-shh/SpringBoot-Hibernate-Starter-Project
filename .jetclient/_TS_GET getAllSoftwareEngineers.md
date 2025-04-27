```toml
name = 'GET getAllSoftwareEngineers'
sortWeight = 2000000
id = '4ea160b6-e8e2-40ab-bd7f-b295cdf45159'
```

#### Script

```js
const response = jc.sendRequest({
    method: 'GET',
    url: 'http://localhost:8080/api/v1/software-engineers'
})
```
