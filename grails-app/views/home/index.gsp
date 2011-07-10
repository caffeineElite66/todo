<h1>Dashboard</h1>

<p>Hello ${username}</p>
<g:each in="${lists}" var="list">
    <div>
        ${list.title} : ${list.description} : ${list.createdAt} <br />
        <g:each in="${list.taskItems}" var="item">
            ${item.title} : ${item.description} <br />
        </g:each>
    </div>
</g:each>