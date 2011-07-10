<h1>Dashboard</h1>

<p>Hello ${username}</p>

<g:each in="${lists}" var="list">
    <div class="user-list">
        <h3>${list.title}</h3>
        <p>${list.description}</p>
        <ul>
            <g:each in="${list.taskItems}" var="item">
                <li>
                    <h4>${item.title}</h4>
                    <p>${item.description}</p>
                </li>
            </g:each>
        </ul>
    </div>
</g:each>